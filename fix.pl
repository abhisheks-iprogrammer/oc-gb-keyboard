@list = ("btn_keyboard_key_dark_pressed",
"btn_keyboard_key_dark_normal",
"btn_keyboard_key_dark_pressed_on",
"btn_keyboard_key_dark_pressed_off",
"btn_keyboard_key_dark_normal_on",
"btn_keyboard_key_dark_normal_off",
"btn_keyboard_key_light_pressed",
"btn_keyboard_key_light_normal" );

foreach $name (@ARGV) {
   $found = 0;

   foreach $change (@list) {
      if ($name =~ /\/$change\./) {
          $found = 1;
          last;
      }
   }

   if ($found) {
       $new = $name;
       $new =~ s/\./_red./;

       print "convert \"$name\" -channel GB -evaluate set 0 +channel \"$new\"\n";
       system "convert \"$name\" -channel GB -evaluate set 0 +channel \"$new\"";
   }
}

