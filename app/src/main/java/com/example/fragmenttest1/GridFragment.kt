package com.example.fragmenttest1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmenttest1.adapters.GridLayoutAdapter
import com.example.fragmenttest1.adapters.ListLayoutAdapter
import com.example.fragmenttest1.databinding.GridfragmentlayoutBinding
import com.example.fragmenttest1.databinding.ListfragmentlayoutBinding

class GridFragment: Fragment() {

    private var _binding:  GridfragmentlayoutBinding? =null
    val binding
    get()=_binding!!



    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = GridfragmentlayoutBinding.inflate(layoutInflater)
        val totalSearchData = listOf<String>("Noah Collins","Sandra Gray","Christopher Townsend","Terri Olson","Jennifer Becker","Brooke Wright","Kelsey Taylor","Kristy Harris","Charles Walker","Melissa Williams","Timothy Ryan","Jasmine Martinez","Robin Silva","Ashley Flores","Claudia Andrews","Martha Elliott","Christine Andrade","Catherine Walker","Gerald Howard","John Boyd","Michael Morton","Monica Zuniga","Andrea Carson","Arthur Fisher","Alexa Jones","Anthony Parker","Pamela Jones MD","Phillip Morgan","David Randolph","Kyle Burns","Luis Navarro","Joshua Hudson","Lisa Patrick","Patricia Schmidt","Kari Obrien","Scott Jenkins","Tina Rivera","Daniel Jackson","John Charles","Jorge Vasquez","Bobby Watson","James Christian","Nicole Young","Justin Mcdowell","Sandra Chen","Ashley Turner MD","George Ellis","Natasha Lozano","Michelle Fox","Erin Moss","Joseph Young","Travis Smith","Christine Wilson","Sarah Erickson","Cynthia Chen","Troy Brooks","Rebecca Smith","Christy Chen","Ashley Rodgers","Jennifer Olson","Alexandria Schwartz","Adam Sheppard","Todd Phillips","Joy Richardson","Diamond Pratt","Ryan Gonzalez","Timothy Estes","Kelly Chase","Jose Warner","Laura Parker","Christine Nelson","Casey Jones","Michael Morrow","Matthew Miller","Fred Conway","Amanda Arnold","Kevin Harris","Michelle Odonnell","Ronald Hunter","Michelle Atkins","Roberta Strickland","Tony Smith","Chelsey Young","Elizabeth Gordon","Nicole Fowler","Michael Robinson","Sean Jones","Austin Bryant","Janice Hunter","Shawna Banks","Vincent Raymond","Sharon Ramirez","Michelle Joseph","Jennifer Thomas","Jason Garcia","Kathy Petersen","Shannon Savage","Diane Young","Travis Long","Charles Turner")
        var adapter = GridLayoutAdapter(totalSearchData)
        binding.apply {
            GridFragmentRC.adapter=adapter

        }

        return binding.root
    }

}