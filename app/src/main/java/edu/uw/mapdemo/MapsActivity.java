package edu.uw.mapdemo;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import static com.google.android.gms.maps.GoogleMap.*;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(47.6550, -122.3080);  //gives the lat and lng for the marker
        mMap.setTrafficEnabled(true);
        mMap.addMarker(new MarkerOptions()
                .position(sydney) //set the position of the marker
                .title("Marker in UW")); //give it a title
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 6));


        /*
        PolylineOptions polylineOptions = new PolylineOptions()
                .add(new LatLng(48.6550, -123.3080))
                .add(new LatLng(46.6550, -123.3080))
                .add(new LatLng(48.6550, -121.3080))
                .add(new LatLng(46.6550, -121.3080))
                .add(new LatLng(48.6550, -123.3080));

        final Polyline polyline = googleMap.addPolyline(polylineOptions);

        polyline.setClickable(true);
        mMap.setOnPolylineClickListener(new OnPolylineClickListener(){
            @Override
            public void onPolylineClick(Polyline polyline)
            {
                Log.v("Google Map", "You clicked me!");
                int strokeColor = polyline.getColor() ^ 0x00ffffff;
                polyline.setColor(strokeColor);
                polyline.setWidth(20);
            }
        });
        */
    }
}
