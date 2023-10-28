package com.preferencedatastorage

/*
DataStore is a new and improved data storage solution aimed at replacing SharedPreferences.
Built on Kotlin coroutines and Flow
DataStore provides two different implementations:
   1.Proto DataStore, that stores typed objects (backed by protocol buffers) and
   2.Preferences DataStore, that stores key-value pairs.
   Adv:   Data is stored asynchronously, consistently, and transactionally,
      and overcoming some of the drawbacks of SharedPreferences.
 */