package com.fenyx4.arkham;

import java.util.ArrayList;

import android.database.AbstractCursor;

public class ColorCursor extends AbstractCursor {
	
	private ArrayList<OtherWorldColor> blah;
	
	public ColorCursor(ArrayList<OtherWorldColor> colors)
	{
		blah = colors;
	}

	@Override
	public String[] getColumnNames() {
		return new String[] { "_ID", "Name" };
	}

	@Override
	public int getCount() {
		return blah.size();
	}

	@Override
	public double getDouble(int arg0) {
		if(arg0 == 0)
			return mPos;
		return 0;
	}

	@Override
	public float getFloat(int arg0) {
		if(arg0 == 0)
			return mPos;
		return 0;
	}

	@Override
	public int getInt(int arg0) {
		if(arg0 == 0)
		{
			return mPos;
		}
		return 0;
	}

	@Override
	public long getLong(int arg0) {
		if(arg0 == 0)
			return mPos;
		return 0;
	}

	@Override
	public short getShort(int arg0) {
		if(arg0 == 0)
			return (short)mPos;
		return 0;
	}
	
	public OtherWorldColor getOtherWorldColor()
	{
		return blah.get(mPos);
	}

	@Override
	public String getString(int arg0) {
		if( arg0 == 1)
		{
			
			return blah.get(mPos).toString();
		}
		else
		{
			return String.valueOf(mPos);
		}
		
	}

	@Override
	public boolean isNull(int arg0) {
		
		return blah.get(arg0) == null;
	}

}
