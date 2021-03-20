package tv.worho.voicerecorder.listRecord

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tv.worho.voicerecorder.database.RecordDatabaseDao
import javax.xml.transform.Source

class ListRecordViewModelFactory (private val dataSource: RecordDatabaseDao): ViewModelProvider.Factory {
    @Suppress("uncheked_cast")
    override fun <T:ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ListRecordViewModel::class.java)) {
            return ListRecordViewModel(dataSource)as T
        }
        throw  IllegalAccessException("Unknown ViewModel class")
    }
}