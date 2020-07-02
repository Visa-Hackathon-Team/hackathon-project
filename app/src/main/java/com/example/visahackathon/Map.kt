package com.example.visahackathon

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlin.collections.Map

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Map : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    lateinit var map_to_home: ImageButton




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.map)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        map_to_home = findViewById(R.id.map_to_home)
        map_to_home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // Add a marker in Sydney and move the camera


        val cupprimo = LatLng(30.4329, -97.7712912)
        mMap.addMarker(MarkerOptions().position(cupprimo).title("Cupprimo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cupprimo))

        val oneTaco = LatLng(30.425263, -97.7540876)
        mMap.addMarker(MarkerOptions().position(oneTaco).title("OneTaco - Taqueria"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(oneTaco))

        val pinup = LatLng(30.430631, -97.7643752)
        mMap.addMarker(MarkerOptions().position(pinup).title("Pinup Salon"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pinup))

        val touchStone = LatLng(30.4158443, -97.7477604)
        mMap.addMarker(MarkerOptions().position(touchStone).title("Touchstone Medical Imaging"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(touchStone))

        val afViolet = LatLng(30.4268802, -97.7601245)
        mMap.addMarker(MarkerOptions().position(afViolet).title("African Violet Personal Chef"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(afViolet))

        val salsa = LatLng(30.426405, -97.7593068)
        mMap.addMarker(MarkerOptions().position(salsa).title("Salsa Austin"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(salsa))

        val berk = LatLng(30.4360885, -97.7719983)
        mMap.addMarker(MarkerOptions().position(berk).title("Berkeley2 Academy"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(berk))

        val russian = LatLng(30.4364056, -97.7722414)
        mMap.addMarker(MarkerOptions().position(russian).title("Russian Overtones"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(russian))

        val catfish =  LatLng(30.4242789,-97.7507321 )
        mMap.addMarker(MarkerOptions().position(catfish).title("Catfish Parlour"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(catfish))

        val greatHill =  LatLng(30.4168043, -97.7480811)
        mMap.addMarker(MarkerOptions().position(greatHill).title("Great Hills Automotive"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(greatHill))

        val shredding = LatLng(32.78337,-96.79722 )
        mMap.addMarker(MarkerOptions().position(shredding).title("Smarter Shredding"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(shredding))

        val empanada = LatLng(32.7826,-96.80495 )
        mMap.addMarker(MarkerOptions().position(empanada).title("The Empanada Cookhouse"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(empanada))

        val india = LatLng(32.77757, -96.79045)
        mMap.addMarker(MarkerOptions().position(india).title("8 Cloves - Spice of India"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(india))

        val abunAro = LatLng(32.777569, -96.790451)
        mMap.addMarker(MarkerOptions().position(abunAro).title("Abundantly Aromatic"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(abunAro))

        val goodCoffee = LatLng(32.78261,-96.7954 )
        mMap.addMarker(MarkerOptions().position(goodCoffee).title("Stupid Good Coffee"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(goodCoffee))

        val alphagraphics = LatLng(32.7826,-96.80495 )
        mMap.addMarker(MarkerOptions().position(alphagraphics).title("Alphagraphics"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alphagraphics))

        val glutenFree = LatLng(32.7826, -96.80495)
        mMap.addMarker(MarkerOptions().position(glutenFree).title("Hannah's Gluten Free Bakery"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(glutenFree))

        val cafeMom = LatLng(32.782263, -96.799508)
        mMap.addMarker(MarkerOptions().position(cafeMom).title("Cafe Momentum"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cafeMom))

        val limon = LatLng(32.783467, -96.800608)
        mMap.addMarker(MarkerOptions().position(limon).title("Salsa Limón : Flor De Mayo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(limon))

        val hawaii = LatLng(32.770487,-96.823192 )
        mMap.addMarker(MarkerOptions().position(hawaii).title("Hawaiian Tropical Plant Sales"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hawaii))





    }


}


//ORIGINAL
//package com.example.visahackathon
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import android.widget.ImageButton
//import androidx.navigation.fragment.findNavController
//
///**
// * A simple [Fragment] subclass as the default destination in the navigation.
// */
//class Map : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.map, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        view.findViewById<ImageButton>(R.id.map_to_home).setOnClickListener {
//            findNavController().navigate(R.id.action_Map_to_Home)
//        }
//    }
//}