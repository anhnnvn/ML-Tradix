package com.example.mltradix.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mltradix.R


class ThirdOnBoarding : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_on_boarding, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ThirdOnBoarding().apply {
                arguments = Bundle().apply {

                }
            }
    }
}