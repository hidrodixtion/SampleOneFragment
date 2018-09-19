package com.projectbox.sampleonefragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {
    companion object {
        const val ARG_TITLE = "title"

        fun newInstance(title: String): MainFragment {
            val bundle = Bundle()
            bundle.putString(ARG_TITLE, title)

            val fragment = MainFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_main, container, false)

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            txt_title.text = "Halo saya fragment di sebelah ${it.getString(ARG_TITLE)}"
        }
    }
}
