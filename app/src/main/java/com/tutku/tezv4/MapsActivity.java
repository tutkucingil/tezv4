package com.tutku.tezv4;

import android.support.v4.app.FragmentActivity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements LocationListener {
//YUSUF BRANCHI
    private GoogleMap mMap;
    boolean isGPSEnabled = false;
    boolean isNetworkEnabled = false;
    boolean canGetLocation = false;
    Location location; // location
    double latitude; // latitude
    double longitude; // longitude
    protected LocationManager locationManager;
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10; // 10 meters
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        if(mMap==null){
           /* mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();*/

        }
        else{
            LatLng istanbulKoordinat = new LatLng(41.021161,29.004065);
            mMap.addMarker(new MarkerOptions().position(istanbulKoordinat).title("Kız Kulesi"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(istanbulKoordinat, 13));
        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
    //    getLocation();
       // sendLatLng_in_Server(getLatitude(), getLongitude());
      //  showGoogleMap(getLatitude(), getLongitude(),"konumum");
    }
   /* public Location getLocation() {
        try {
            locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);

            // GPS durumunu(true/false) elde ettik
            isGPSEnabled = locationManager
                    .isProviderEnabled(LocationManager.GPS_PROVIDER);

            // Network durumunu(true/false) elde ettik
            isNetworkEnabled = locationManager
                    .isProviderEnabled(LocationManager.NETWORK_PROVIDER);

            if (!isGPSEnabled && !isNetworkEnabled) {
                //Network olmadığında bu koşula girer
            } else {
                this.canGetLocation = true;
                //Network Provider'dan ilk lokasyonu aldık
                if (isNetworkEnabled) {
                   /* locationManager.requestLocationUpdates(
                           LocationManager.NETWORK_PROVIDER,
                            MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, MapsActivity.this);*/

                 /*   if (locationManager != null) {
                       location = locationManager
                                .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                        }
                    }
                }
                //Eğer GPS etkin ise GPS Services kullanarak  latitude/longitude değerlerini alıyoruz
                if (isGPSEnabled) {
                    if (location == null) {
                      /*  locationManager.requestLocationUpdates(
                                LocationManager.GPS_PROVIDER,
                                MIN_TIME_BW_UPDATES,
                                MIN_DISTANCE_CHANGE_FOR_UPDATES,MapsActivity.this);*/
                   /*     if (locationManager != null) {
                            location = locationManager
                                    .getLastKnownLocation(LocationManager.GPS_PROVIDER);
                            if (location != null) {
                                latitude = location.getLatitude();
                                longitude = location.getLongitude();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return location;
    }
  /*  public void stopUsingGPS(){
        if(locationManager != null){
          //  locationManager.removeUpdates(MapsActivity.this);
        }
    }*/
    /**
     * latitude(enlem) değerini donduren metod
     * */
  /*  public double getLatitude(){
        if(location != null){
            latitude = location.getLatitude();
        }
        return latitude;
    }*/
    /**
     * longitude(boylam) değerini donduren metod
     * */
  /*  public double getLongitude(){
        if(location != null){
            longitude = location.getLongitude();
        }
        return longitude;
    }*/
    @Override
    public void onLocationChanged(Location location) {
    }
    @Override
    public void onProviderDisabled(String provider) {
    }
    @Override
    public void onProviderEnabled(String provider) {
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }
    /**
     * Google Map üzerinde latitude ve longitude değerlerine göre konumları işaretleyerek gösteren metod
     * @param lat
     * @param lng
     * @param locatioName
     */

 /*   public void showGoogleMap(double lat,double lng,String locatioName){
        LatLng TutorialsPoint = new LatLng(lat, lng);
        GoogleMap googleMap = null;

        try {
            if (googleMap == null) {
                //googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).onActivityCreated();
            }
            //Haritanın üzerinde bulunan, haritayı büyütüp küçültmek için kullanılan zooming button aktif ettim
            googleMap.getUiSettings().setZoomControlsEnabled(true);
            //Harita üzerinde işaretlenmiş konumlara haritayı büyüterek yani zoomlama yaparak fokuslanmasını yapan kod
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(lat, lng)).zoom(12).build();
            googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            //--
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            //Google Map üzerinde konum işaretlemeyi sağlayan imleci olusturan kod
            //title metodu; imlec konulan yere isim vermenizi sağlar
            Marker TP = googleMap.addMarker(new MarkerOptions().position(TutorialsPoint).title(locatioName));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    /*
    *    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }*/

}
