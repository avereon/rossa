package com.avereon.rossa.icon;

import com.avereon.venza.image.RenderedIcon;

public class ArrowIcon extends SymbolIcon {

	@Override
	protected void render() {
		rotate();

		startPath();
		moveTo( g( 16 ), g( 16 - L ) );
		lineTo( g( 16 ), g( 16 + L ) );
		moveTo( g( 16 - L ), g( 16 ) );
		lineTo( g( 16 ), g( 16 - L ) );
		lineTo( g( 16 + L ), g( 16 ) );
		draw();

		reset();
	}

	protected void rotate() {}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new ArrowIcon() );
	}

}
