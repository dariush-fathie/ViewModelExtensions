package com.github.dariushfathie.viewmodelextensions


import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {


    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @ExperimentalCoroutinesApi
    val mainViewModel = MainViewModel(
        TestDispatchersProvider(mainCoroutineRule.testCoroutineDispatcher)
    )

    @ExperimentalCoroutinesApi
    @Test
    fun saveDataOnIODispatcher() {
        mainCoroutineRule.runBlockingTest {
            mainViewModel.saveDataOnIO()
            advanceUntilIdle()

            assertTrue(mainViewModel.isSaved)
        }

        mainCoroutineRule.testCoroutineDispatcher.cleanupTestCoroutines()
    }


    @ExperimentalCoroutinesApi
    @Test
    fun `session must be expired after 10 seconds`() {
        mainCoroutineRule.runBlockingTest {
            mainViewModel.checkSessionExpired()
            advanceUntilIdle()

            assertTrue(mainViewModel.isSessionExpired)
        }

        mainCoroutineRule.testCoroutineDispatcher.cleanupTestCoroutines()
    }

}

