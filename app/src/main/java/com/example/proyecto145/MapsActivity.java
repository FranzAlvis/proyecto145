package com.example.proyecto145;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.proyecto145.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        /*LatLng sydney = new LatLng(-19.034750, -65.266647);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sucre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng potosi = new LatLng(-19.579530, -65.756460);
        mMap.addMarker(new MarkerOptions().position(potosi).title("Marker in Potosi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(potosi));*/

        LatLng HEL_CON_31 = new LatLng(-19.057761, -65.273408);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_31).title("VILLA FATIMA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_31,11));

        LatLng HEL_CON_32 = new LatLng(-19.045908, -65.234172);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_32).title("ALTO SIMON BOLIVAR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_32,11));

        LatLng HEL_CON_33 = new LatLng(-19.043847, -65.241000);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_33).title("BARRIO LIBERTADORES CALLE SANTA LUCIA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_33,11));

        LatLng HEL_CON_34 = new LatLng(-19.051567, -65.249833);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_34).title("SAN JOSE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_34,11));

        LatLng HEL_CON_35 = new LatLng(-19.043681, -65.253656);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_35).title("MAMA BOLERA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_35,11));

        LatLng HEL_CON_36 = new LatLng(-19.059747, -65.275953);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_36).title("SAN MARTIN (REUBICADO A 1RO DE MAYO)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_36,11));

        LatLng HEL_CON_37 = new LatLng(-19.058289, -65.274428);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_37).title("PUENTE EL TEJAR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_37,11));

        LatLng HEL_CON_38 = new LatLng(-19.020792, -65.277575);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_38).title("MAGISTERIO INTEGRADO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_38,11));

        LatLng HEL_CON_39 = new LatLng(-19.021394, -65.275958);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_39).title("MAGISTERIO INTEGRADO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_39,11));

        LatLng HEL_CON_40 = new LatLng(-19.058431, -65.235533);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_40).title("BICENTENARIO 'B' (EL SANCHO)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_40,11));

        LatLng HEL_CON_41 = new LatLng(-19.063689, -65.229075);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_41).title("KOLPING (EL SANCHO)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_41,11));

        LatLng HEL_CON_42 = new LatLng(-19.065328, -65.231114);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_42).title("VIRGEN DEL ROSARIO (EL SANCHO)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_42,11));

        LatLng HEL_CON_43 = new LatLng(-19.011736, -65.307286);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_43).title("JARDIN DE LOS ANGELES"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_43,11));

        LatLng HEL_CON_44 = new LatLng(-19.034078, -65.264425);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_44).title("NORIAL ALTA PLAZA TOCOPILLA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_44,11));

        LatLng HEL_CON_45 = new LatLng(-19.028383, -65.260533);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_45).title("FINAL G. BUSCH BAJO DELICIAS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_45,11));

        LatLng HEL_CON_46 = new LatLng(-19.028381, -65.260506);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_46).title("FINAL G. BUSCH BAJO DELICIAS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_46,11));

        LatLng HEL_CON_48 = new LatLng(-19.018886, -65.264364);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_48).title("CIMACO (REUBICADO A CRUCE VILLA ARMONIA)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_48,11));

        LatLng HEL_CON_49 = new LatLng(-19.005925, -65.282406);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_49).title("ALTO SUCRE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_49,11));

        LatLng HEL_CON_50 = new LatLng(-19.135258, -65.203683);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_50).title("GUERRA LOMA KOCHIS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_50,11));

        LatLng HEL_CON_47 = new LatLng(-19.027536, -65.257933);
        mMap.addMarker(new MarkerOptions().position(HEL_CON_47).title("ALTO DELICIAS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HEL_CON_47,12));

    }
}



















