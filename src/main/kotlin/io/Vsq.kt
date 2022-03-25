@file:Suppress("SpellCheckingInspection")

package io

import model.ExportResult
import model.Feature
import model.Format
import model.ImportParams
import model.Project
import org.w3c.files.File

object Vsq {
    suspend fun parse(file: File, params: ImportParams): Project {
        return VsqLike.getMappedTrackData(file, Format.Vsq, params)
    }

    fun generate(project: Project, features: List<Feature>): ExportResult {
        return VsqLike.getExportResult(project, features, Format.Vsq)
    }
}
