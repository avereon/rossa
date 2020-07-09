package com.avereon.rossa.icon;

import com.avereon.venza.image.SvgIcon;

public class LightningBoltIcon extends SvgIcon {

	public LightningBoltIcon() {
		// Thin
		add( "M16,1 L11,19 L16,19 L16,31 L21,13 L16,13 Z" );

		// Thick
		//add( "M17,3 L5,19 L18,19 L15,29 L27,13 L14,13 Z" );
	}
	public static void main( String[] commands ) {
		proof( new LightningBoltIcon() );
	}

}
