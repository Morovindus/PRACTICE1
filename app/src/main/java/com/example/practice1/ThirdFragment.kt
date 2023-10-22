package com.example.practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.practice1.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button2: Button = requireActivity().findViewById(R.id.basket_button)
        val button1: Button = requireActivity().findViewById(R.id.shop_button)
        button2.setOnClickListener{
            findNavController().navigate(R.id.action_ThirdFragment_to_SecondFragment)
        }
        button1.setOnClickListener{
            findNavController().navigate(R.id.action_ThirdFragment_to_FirstFragment)
        }
    }

    companion object{
        @JvmStatic
        fun newInstance() = ThirdFragment()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}