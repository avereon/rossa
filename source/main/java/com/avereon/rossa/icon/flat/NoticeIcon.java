package com.avereon.rossa.icon.flat;

import com.avereon.venza.icon.RenderedIcon;
import javafx.scene.paint.Color;

public class NoticeIcon extends RenderedIcon {

	public NoticeIcon() {
		super();
	}

	public NoticeIcon( Color color ) {
		super();
		setRenderPaint( color );
	}

	@Override
	protected void render() {
		int w = 28;
		int h = 28;

		int c = 16;
		int hr = w / 2;
		int vr = h / 2;

		startPath();
		addCenteredArc( g( c ), g( c ), g( hr ), g( vr ), 0, 270 );
		addCenteredArc( g( c + hr - 2 ), g( c + vr - 2 ), g( 2 ), g( 2 ), 270, 90 );
		closePath();

		fill();
	}

	public static void main( String[] commands ) {
		proof( new NoticeIcon( Color.GREEN ) );
	}

}