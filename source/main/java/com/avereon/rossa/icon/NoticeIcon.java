package com.avereon.rossa.icon;

import com.avereon.venza.color.Colors;
import com.avereon.venza.image.ProgramIcon;
import javafx.scene.paint.Color;

public class NoticeIcon extends ProgramIcon {

	public NoticeIcon() {
		super();
	}

	public NoticeIcon( Color color ) {
		super();
		String webColor = Colors.web( color );
		setStyle( "-xe-theme-color: " + webColor + "; -xe-outline-paint: " + webColor + ";" );
	}

	@Override
	protected void render() {
		int w = 26;
		int h = 26;

		int c = 16;
		int r = c + w / 2;
		int hr = w / 2;
		int vr = h / 2;

		startPath();
		moveTo( g( r ), g( c + vr ) );
		lineTo( g( r ), g( c ) );
		addArc( g( c ), g( c ), g( hr ), g( vr ), 0, 270 );
		closePath();

		fill();
		draw();
	}

	public static void main( String[] commands ) {
		proof( new NoticeIcon( Color.GREEN ) );
	}

}
