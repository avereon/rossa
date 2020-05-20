package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;

public class DocumentIcon extends RenderedIcon {

	@Override
	protected void render() {
		// Page
		page3();
		fill();
		//draw();

		// Fold
		fold3();
		fill();

		//		// Page outline
		//		page();
		//		draw();
		//
		//		// Fold outline
		//		fold( false );
		//		draw();
	}

	private void page() {
		startPath();
		moveTo( g( 6 ), g( 4 ) );
		lineTo( g( 6 ), g( 28 ) );
		lineTo( g( 26 ), g( 28 ) );
		lineTo( g( 26 ), g( 14 ) );
		lineTo( g( 16 ), g( 14 ) );
		lineTo( g( 16 ), g( 4 ) );
		closePath();
	}

	private void fold( ) {
		startPath( g( 20 ), g( 2 ) );
		lineTo( g( 20 ), g( 10 ) );
		lineTo( g( 28 ), g( 10 ) );
		 closePath();
	}

	private void page2() {
		startPath( g( 18 ), g( 2 ) );
		addCenteredArc( g( 6 ), g( 4 ), g( 2 ), g( 2 ), 90, 90 );
		addCenteredArc( g( 6 ), g( 28 ), g( 2 ), g( 2 ), 180, 90 );
		addCenteredArc( g( 26 ), g( 28 ), g( 2 ), g( 2 ), 270, 90 );
		lineTo( g( 28 ), g( 12 ) );
		lineTo( g( 18 ), g( 12 ) );
		closePath();
	}

	private void fold2() {
		startPath();
		moveTo( g( 20 ), g( 2 ) );
		lineTo( g( 20 ), g( 10 ) );
		lineTo( g( 28 ), g( 10 ) );
		addCenteredArc( g( 26 ), g( 10 ), g( 2 ), g( 2 ), 0, 45 );
		addCenteredArc( g( 20 ), g( 4 ), g( 2 ), g( 2 ), 45, 45 );
		closePath();
	}

	private void fold2a() {
		startPath();
		moveTo( g( 20 ), g( 2 ) );
		lineTo( g( 20 ), g( 10 ) );
		lineTo( g( 28 ), g( 10 ) );
		addCenteredArc( g( 26 ), g( 9 ), g( 2 ), g( 2 ), 0, 45 );
		addCenteredArc( g( 21 ), g( 4 ), g( 2 ), g( 2 ), 45, 45 );
		closePath();
	}

	private void page3() {
		startPath( g( 18 ), g( 2 ) );
		addCenteredArc( g( 6 ), g( 4 ), g( 2 ), g( 2 ), 90, 90 );
		addCenteredArc( g( 6 ), g( 28 ), g( 2 ), g( 2 ), 180, 90 );
		addCenteredArc( g( 26 ), g( 28 ), g( 2 ), g( 2 ), 270, 90 );
		lineTo( g( 28 ), g( 12 ) );
		addCenteredArc( g(22),g(8),g(4),g(4),270,-90);
		//lineTo( g( 18 ), g( 12 ) );
		closePath();
	}

	private void fold3( ) {
		startPath( g( 20 ), g( 2 ) );
		addCenteredArc( g( 22), g(8), g(2), g(2), 180, 90 );
		//lineTo( g( 20 ), g( 10 ) );
		lineTo( g( 28 ), g( 10 ) );
		closePath();
	}


	public static void main( String[] commands ) {
		proof( new DocumentIcon() );
	}

}
