package com.android.inputmethod.latin;

import mobi.pruss.android.inputmethod.latin.R;

import android.graphics.drawable.Drawable;
import android.content.Context;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.util.Log;

public class Theme {
	private static Context context = null;
	public static final int COLOR = 0;
	public static final int LAYOUT = 1;
	public static final int XML = 2;
	public static final int DRAWABLE = 3;
	private static final int[][] colorNight = 
		{ { R.color.candidate_normal, R.color.red_candidate_normal },
		  { R.color.candidate_recommended, R.color.red_candidate_recommended},
		  { R.color.candidate_other, R.color.red_candidate_other }
		};
	private static final int[][] layoutNight = 
	{ {R.layout.candidate_preview, R.layout.candidate_preview_red },
	  {R.layout.candidates, R.layout.candidates_red } };
	private static final int[][] xmlNight = {		
		{ R.xml.kbd_phone, R.xml.red_kbd_phone },
		{ R.xml.kbd_phone_black, R.xml.red_kbd_phone_black },
		{ R.xml.kbd_phone_symbols, R.xml.red_kbd_phone_symbols },
		{ R.xml.kbd_phone_symbols_black, R.xml.red_kbd_phone_symbols_black },
		{ R.xml.kbd_qwerty, R.xml.red_kbd_qwerty },
		{ R.xml.kbd_qwerty_black, R.xml.red_kbd_qwerty_black },
		{ R.xml.kbd_symbols, R.xml.red_kbd_symbols },
		{ R.xml.kbd_symbols_black, R.xml.red_kbd_symbols_black },
		{ R.xml.kbd_symbols_shift, R.xml.red_kbd_symbols_shift },
		{ R.xml.kbd_symbols_shift_black, R.xml.red_kbd_symbols_shift_black },
		{ R.xml.popup_at, R.xml.red_popup_at },
		{ R.xml.popup_comma, R.xml.red_popup_comma },
		{ R.xml.popup_mic, R.xml.red_popup_mic },
		{ R.xml.popup_slash, R.xml.red_popup_slash }				
	};
	private static final int[][] drawableNight = {
		{ R.drawable.sym_bkeyboard_123_mic, R.drawable.red_sym_bkeyboard_123_mic },
		{ R.drawable.sym_bkeyboard_delete, R.drawable.red_sym_bkeyboard_delete },
		{ R.drawable.sym_bkeyboard_done, R.drawable.red_sym_bkeyboard_done },
		{ R.drawable.sym_bkeyboard_mic, R.drawable.red_sym_bkeyboard_mic },
		{ R.drawable.sym_bkeyboard_num0, R.drawable.red_sym_bkeyboard_num0 },
		{ R.drawable.sym_bkeyboard_num1, R.drawable.red_sym_bkeyboard_num1 },
		{ R.drawable.sym_bkeyboard_num2, R.drawable.red_sym_bkeyboard_num2 },
		{ R.drawable.sym_bkeyboard_num3, R.drawable.red_sym_bkeyboard_num3 },
		{ R.drawable.sym_bkeyboard_num4, R.drawable.red_sym_bkeyboard_num4 },
		{ R.drawable.sym_bkeyboard_num5, R.drawable.red_sym_bkeyboard_num5 },
		{ R.drawable.sym_bkeyboard_num6, R.drawable.red_sym_bkeyboard_num6 },
		{ R.drawable.sym_bkeyboard_num7, R.drawable.red_sym_bkeyboard_num7 },
		{ R.drawable.sym_bkeyboard_num8, R.drawable.red_sym_bkeyboard_num8 },
		{ R.drawable.sym_bkeyboard_num9, R.drawable.red_sym_bkeyboard_num9 },
		{ R.drawable.sym_bkeyboard_numalt, R.drawable.red_sym_bkeyboard_numalt },
		{ R.drawable.sym_bkeyboard_numpound, R.drawable.red_sym_bkeyboard_numpound },
		{ R.drawable.sym_bkeyboard_numstar, R.drawable.red_sym_bkeyboard_numstar },
		{ R.drawable.sym_bkeyboard_return, R.drawable.red_sym_bkeyboard_return },
		{ R.drawable.sym_bkeyboard_search, R.drawable.red_sym_bkeyboard_search },
		{ R.drawable.sym_bkeyboard_settings, R.drawable.red_sym_bkeyboard_settings },
		{ R.drawable.sym_bkeyboard_shift, R.drawable.red_sym_bkeyboard_shift },
		{ R.drawable.sym_bkeyboard_shift_locked, R.drawable.red_sym_bkeyboard_shift_locked },
		{ R.drawable.sym_bkeyboard_space, R.drawable.red_sym_bkeyboard_space },
		{ R.drawable.sym_bkeyboard_tab, R.drawable.red_sym_bkeyboard_tab },
		{ R.drawable.sym_keyboard_123_mic, R.drawable.red_sym_keyboard_123_mic },
		{ R.drawable.sym_keyboard_delete, R.drawable.red_sym_keyboard_delete },
		{ R.drawable.sym_keyboard_done, R.drawable.red_sym_keyboard_done },
		{ R.drawable.sym_keyboard_feedback_123_mic, R.drawable.red_sym_keyboard_feedback_123_mic },
		{ R.drawable.sym_keyboard_feedback_delete, R.drawable.red_sym_keyboard_feedback_delete },
		{ R.drawable.sym_keyboard_feedback_done, R.drawable.red_sym_keyboard_feedback_done },
		{ R.drawable.sym_keyboard_feedback_language_arrows_left, R.drawable.red_sym_keyboard_feedback_language_arrows_left },
		{ R.drawable.sym_keyboard_feedback_language_arrows_right, R.drawable.red_sym_keyboard_feedback_language_arrows_right },
		{ R.drawable.sym_keyboard_feedback_mic, R.drawable.red_sym_keyboard_feedback_mic },
		{ R.drawable.sym_keyboard_feedback_numalt, R.drawable.red_sym_keyboard_feedback_numalt },
		{ R.drawable.sym_keyboard_feedback_return, R.drawable.red_sym_keyboard_feedback_return },
		{ R.drawable.sym_keyboard_feedback_search, R.drawable.red_sym_keyboard_feedback_search },
		{ R.drawable.sym_keyboard_feedback_settings, R.drawable.red_sym_keyboard_feedback_settings },
		{ R.drawable.sym_keyboard_feedback_shift, R.drawable.red_sym_keyboard_feedback_shift },
		{ R.drawable.sym_keyboard_feedback_shift_locked, R.drawable.red_sym_keyboard_feedback_shift_locked },
		{ R.drawable.sym_keyboard_feedback_space, R.drawable.red_sym_keyboard_feedback_space },
		{ R.drawable.sym_keyboard_feedback_tab, R.drawable.red_sym_keyboard_feedback_tab },
		{ R.drawable.sym_keyboard_language_arrows_left, R.drawable.red_sym_keyboard_language_arrows_left },
		{ R.drawable.sym_keyboard_language_arrows_right, R.drawable.red_sym_keyboard_language_arrows_right },
		{ R.drawable.sym_keyboard_mic, R.drawable.red_sym_keyboard_mic },
		{ R.drawable.sym_keyboard_num0, R.drawable.red_sym_keyboard_num0 },
		{ R.drawable.sym_keyboard_num1, R.drawable.red_sym_keyboard_num1 },
		{ R.drawable.sym_keyboard_num2, R.drawable.red_sym_keyboard_num2 },
		{ R.drawable.sym_keyboard_num3, R.drawable.red_sym_keyboard_num3 },
		{ R.drawable.sym_keyboard_num4, R.drawable.red_sym_keyboard_num4 },
		{ R.drawable.sym_keyboard_num5, R.drawable.red_sym_keyboard_num5 },
		{ R.drawable.sym_keyboard_num6, R.drawable.red_sym_keyboard_num6 },
		{ R.drawable.sym_keyboard_num7, R.drawable.red_sym_keyboard_num7 },
		{ R.drawable.sym_keyboard_num8, R.drawable.red_sym_keyboard_num8 },
		{ R.drawable.sym_keyboard_num9, R.drawable.red_sym_keyboard_num9 },
		{ R.drawable.sym_keyboard_numalt, R.drawable.red_sym_keyboard_numalt },
		{ R.drawable.sym_keyboard_numpound, R.drawable.red_sym_keyboard_numpound },
		{ R.drawable.sym_keyboard_numstar, R.drawable.red_sym_keyboard_numstar },
		{ R.drawable.sym_keyboard_return, R.drawable.red_sym_keyboard_return },
		{ R.drawable.sym_keyboard_search, R.drawable.red_sym_keyboard_search },
		{ R.drawable.sym_keyboard_settings, R.drawable.red_sym_keyboard_settings },
		{ R.drawable.sym_keyboard_shift, R.drawable.red_sym_keyboard_shift },
		{ R.drawable.sym_keyboard_shift_locked, R.drawable.red_sym_keyboard_shift_locked },
		{ R.drawable.sym_keyboard_space, R.drawable.red_sym_keyboard_space },
		{ R.drawable.sym_keyboard_space_led, R.drawable.red_sym_keyboard_space_led },
		{ R.drawable.sym_keyboard_tab, R.drawable.red_sym_keyboard_tab },
		{ R.drawable.hint_popup, R.drawable.red_hint_popup }
	};
	
	public static Drawable getDrawable(Resources res, int id) {
		return res.getDrawable(adjust(DRAWABLE, id));
	}
	
	public static void setContext(Context c) {
		context = c;
	}
	
	public static boolean IsNightMode() {
		if (context == null) {
			return false;
		}
		return PreferenceManager.getDefaultSharedPreferences(context).getString(KeyboardSwitcher.PREF_KEYBOARD_LAYOUT, 
			    KeyboardSwitcher.DEFAULT_LAYOUT_ID).equals(KeyboardSwitcher.RED_LAYOUT_ID); 
	}
	
	public static int adjust(int type, int id) {
		int replacement[][];
		
		if (!IsNightMode()) {
			return id;
		}
		
		switch(type) {
			case COLOR:
				replacement = colorNight;
				break;
			case LAYOUT:
				replacement = layoutNight;
				break;
			case XML:
				replacement = xmlNight;
				break;
			case DRAWABLE:
				replacement = drawableNight;
				break;
			default:
			    return id;
		}
	
		for (int i=0; i < replacement.length; i++) {
			if(id == replacement[i][0]) {
				Log.i("replaced "+id, "with "+replacement[i][1]);
				return replacement[i][1];
			}
		}
		
		return id;
	}
}
