package model

import process.RichNote

data class Note(
    val id: Int,
    val key: Int,
    val lyric: String,
    val tickOn: Long,
    val tickOff: Long,
    val xSampa: String? = null
) : RichNote<Note> {
    val length get() = tickOff - tickOn

    override val note: Note
        get() = this

    override fun copyWithNote(note: Note) = note
}
