package com.avereon.rossa.icon;

import com.avereon.venza.image.ProgramIcon;

public class CloseToolIcon extends ProgramIcon {

	private final int s = 6;

	public CloseToolIcon() {
	}

	@Override
	protected void render() {
		int a = 16 - s;
		int b = 16 + s;
		setDrawWidth( 3 * getOutlineWidth() );
		drawLine( g( a ), g( a ), g( b ), g( b ) );
		drawLine( g( a ), g( b ), g( b ), g( a ) );
	}

	public static void main( String[] commands ) {
		proof( new CloseToolIcon() );
	}

}
