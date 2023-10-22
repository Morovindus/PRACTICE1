package com.example.practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.practice1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button3: Button = requireActivity().findViewById(R.id.personal_button)
        val button1: Button = requireActivity().findViewById(R.id.shop_button)
        button3.setOnClickListener{
            findNavController().navigate(R.id.action_SecondFragment_to_ThirdFragment)
        }
        button1.setOnClickListener{
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    companion object{
        @JvmStatic
        fun newInstance() = SecondFragment()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}