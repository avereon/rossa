package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class PreferencesIcon extends RenderedIcon {

	private static final double c1 = 8;

	private static final double c2 = 16;

	private static final double c3 = 24;

	private static final double k1 = 20;

	private static final double k2 = 12;

	private static final double k3 = 20;

	private static final double n = 6;

	private static final double s = 26;

	@Override
	protected void render() {
		save();
		startPath();
		addRect( g( 0 ), g( 0 ), g( 32 ), g( 32 ) );
		moveTo( g( c1 ), g( k1 ) );
		addArc( g( c1 ), g( k1 ), g( 3 ), g( 3 ), 0, 360 );
		closePath();
		clip();
		startPath();
		addLine( g( c1 ), g( n ), g( c1 ), g( s ) );
		closePath();
		draw();
		restore();

		save();
		startPath();
		addRect( g( 0 ), g( 0 ), g( 32 ), g( 32 ) );
		moveTo( g( c2 ), g( k2 ) );
		addArc( g( c2 ), g( k2 ), g( 3 ), g( 3 ), 0, 360 );
		closePath();
		clip();
		startPath();
		addLine( g( c2 ), g( n ), g( c2 ), g( s ) );
		closePath();
		draw();
		restore();

		save();
		startPath();
		addRect( g( 0 ), g( 0 ), g( 32 ), g( 32 ) );
		moveTo( g( c3 ), g( k3 ) );
		addArc( g( c3 ), g( k3 ), g( 3 ), g( 3 ), 0, 360 );
		closePath();
		clip();
		startPath();
		addLine( g( c3 ), g( n ), g( c3 ), g( s ) );
		closePath();
		draw();
		restore();

		// 8
		move( g( c1 ), g( k3 ) );
		knob();
		reset();

		// 16
		move( g( c2 ), g( k2 ) );
		knob();
		reset();

		// 24
		move( g( c3 ), g( k3 ) );
		knob();
		reset();
	}

	private void knob() {
		startPath();
		moveTo( 0, 0 );
		addArc( 0, 0, g( 4 ), g( 4 ), 0, 360 );
		moveTo( 0, 0 );
		addArc( 0, 0, g( 2 ), g( 2 ), 0, 360 );
		closePath();
		fill();
	}

	public static void main( String[] commands ) {
		RenderedIcon.proof( new PreferencesIcon() );
	}

}
