package com.kotlinassignment

import android.R
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kotlinassignment.databinding.ActivityMainBinding
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.testng.reporters.jq.Main


@RunWith(PowerMockRunner::class)
@PrepareForTest(ActivityMainBinding::class)
class MainActivityTest{

   /* @Mock
     val activity= MainActivity()

    @Mock
    private lateinit var binding: ActivityMainBinding

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        PowerMockito.mockStatic(ActivityMainBinding::class.java)
       // whenever(ActivityMainBinding.bind(mMockView)).thenReturn(binding)
        binding = ActivityMainBinding.inflate(activity.)
    }

    @Test
    fun `displays data list when available`() {
        val dataList = listOf(
            ListData(
                "Testing title",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/220px-American_Beaver.jpg",
                "Testing Description"
            ),
            ListData(
                "Testing title1",
                "http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/220px-American_Beaver.jpg",
                "Testing Description1"
            )
        )


       // assertEquals(View.VISIBLE, activity..visibility)
        assertEquals(View.GONE, binding.norecord.visibility)

        assertEquals(dataList, (binding.recyclerview.adapter as? ListDataAdpter)?.setData(dataList))
    }

    @Test
    fun `displays error view when error obtaining data`() {

        assertEquals(View.GONE, binding.recyclerview.visibility)
        assertEquals(View.VISIBLE, binding.norecord.visibility)
    }
    @Test
    fun `has visible loading view on create`() {
        assertEquals(View.VISIBLE, binding.progressDialog.visibility)
        assertEquals(View.GONE, binding.recyclerview.visibility)
        assertEquals(View.GONE, binding.norecord.visibility)
    }
*/
}