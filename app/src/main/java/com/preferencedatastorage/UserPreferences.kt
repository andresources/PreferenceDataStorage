package com.preferencedatastorage

import android.content.Context


class UserPreferences(var context: Context) {
    /*private val applicationContext = context.applicationContext
    private val dataStore: DataStore<Preferences>
    init {
        //1.Creating a DataStore instance using createDataStore()
        dataStore = applicationContext.createDataStore(name = "app_preferences")
    }

    //2. Defining Key for the Value using preferencesKey<T>(name: String)
    companion object {
        val KEY_BOOKMARK = preferencesKey<String>("key_bookmark")
       // val KEY_BOOKMARK1 = stringPreferencesKey("key_bookmark")
    }

    //3. edit lambda fun. to store data and it return MutablePreferences instance,
       // using it directly assign any value to it using the key

    suspend fun saveBookMark(bookMark: String){
        dataStore.edit {
            it[KEY_BOOKMARK] = bookMark
        }
    }

    //4. Read data back from data source using "data" fun
   val bookmark: Flow<String?>
        get() = dataStore.data.map {
            it[KEY_BOOKMARK]
        }
*/

}