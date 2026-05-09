package com.h.patutuilauncher

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
class MainActivity : ComponentActivity() {
    private lateinit var opengl_view: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        opengl_view = GLSurfaceView(this).apply {
            setEGLContextClientVersion(2)
            setRenderer(Renderer())
        }
        setContentView(opengl_view)
    }

    override fun onResume() {
        super.onResume()
        opengl_view.onResume()
    }

    override fun onPause() {
        super.onPause()
        opengl_view.onPause()
    }
}