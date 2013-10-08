package de.avpptr.umweltzone.utils;

import com.google.android.gms.maps.model.LatLng;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class GeoPoint {

    private static final DecimalFormat df =
            new DecimalFormat("@@@@@", new DecimalFormatSymbols(Locale.US));
    protected double mLatitude;
    protected double mLongitude;

    public GeoPoint(int latitudeE6, int longitudeE6) {
        mLatitude = latitudeE6 / 1e6;
        mLongitude = longitudeE6 / 1e6;
    }

    public GeoPoint(LatLng latLng) {
        mLatitude = latLng.latitude;
        mLongitude = latLng.longitude;
    }

    public GeoPoint(double latitude, double longitude) {
        mLatitude = latitude;
        mLongitude = longitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public LatLng toLatLng() {
        return new LatLng(mLatitude, mLongitude);
    }

    @Override
    public String toString() {
        return "latitude = " + df.format(mLatitude) + ", longitude = " + df.format(mLongitude);
    }

}