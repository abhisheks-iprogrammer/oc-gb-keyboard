package com.android.inputmethod.latin;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;

public class HardKeyRemap {
	String  lastApp;
	boolean active;
	LatinIME ime;	
	SharedPreferences pref;
	String   cachedPackage;
	int		 cachedMode;
	public static final int MODE_NONE = 0;
	public static final int MODE_VOLUME_LEFT_RIGHT = 1;
	public static final int MODE_VOLUME_UP_DOWN = 2;
	public static final int volumeUp[] = { 0,
		KeyEvent.KEYCODE_DPAD_LEFT,
		KeyEvent.KEYCODE_DPAD_UP
	};
	public static final int volumeDown[] = { 0,
		KeyEvent.KEYCODE_DPAD_RIGHT,
		KeyEvent.KEYCODE_DPAD_DOWN
	};
	
	public HardKeyRemap(LatinIME ime) {
		this.ime = ime;
		pref = ime.getSharedPreferences("hardKeyRemap", 0);
		active = true; //pref.getBoolean("active..", false);
		cachedPackage = null;
	}
	
	public boolean handleKeyEvent(int keyCode, KeyEvent event) {
		if (!active)
			return false;
		
		if (keyCode != KeyEvent.KEYCODE_VOLUME_UP &&
				keyCode != KeyEvent.KEYCODE_VOLUME_DOWN) 
			return false;
		
		String p = ime.getCurrentInputEditorInfo().packageName;
		if (! p.equals(cachedPackage)) {
			// cachedMode = pref.getInt(p, MODE_NONE);
			if (p.equals("com.overdrive.mobile.android.mediaconsole")) {
				cachedMode = MODE_VOLUME_LEFT_RIGHT;
			}
		}
		if (cachedMode == MODE_NONE)
			return false;
		
		int newCode = 0;
		
		if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) 
			newCode = volumeUp[cachedMode];
		else if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) 
			newCode = volumeDown[cachedMode];
		
		if (newCode == 0)
			return false;
		
        ime.getCurrentInputConnection().sendKeyEvent( 
                new KeyEvent(event.getAction(), newCode));
        
        return true;
	}
}
