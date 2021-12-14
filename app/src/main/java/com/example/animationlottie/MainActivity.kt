package com.example.animationlottie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    private  var islog = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu , menu)
        return true

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.login-> {return true}
            R.id.logout-> {return true}
            R.id.search -> {

                val intent = Intent(this, MenuS::class.java)
                this.startActivity(intent)

                return true

            }
            else -> false
        }}


    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        var login =menu?.findItem(R.id.login)
        var logout =menu?.findItem(R.id.logout)
        if (islog) {
            islog = !islog
            login?.setVisible(true)
            logout?.setVisible(false)
        }else{
            islog = !islog
            login?.setVisible(false)
            logout?.setVisible(true)

        }
        return true



    }}


