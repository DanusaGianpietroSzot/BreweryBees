package com.ciandt.brewerybees.di

import com.ciandt.brewerybees.ui.main.dialog.SearchResultViewModel
import org.koin.dsl.module

val viewModelModule = module {

   factory { SearchResultViewModel(get()) }
}