package tv.worho.voicerecorder.listRecord

import androidx.lifecycle.ViewModel
import tv.worho.voicerecorder.database.RecordDatabaseDao
import javax.sql.CommonDataSource

class ListRecordViewModel(
    dataSource: RecordDatabaseDao
): ViewModel() {
    val database = dataSource
    val records = database.getAllRecords()
}