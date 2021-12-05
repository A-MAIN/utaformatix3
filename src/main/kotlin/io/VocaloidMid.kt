@file:Suppress("SpellCheckingInspection")

package io

import model.ExportResult
import model.Feature
import model.Format
import model.Project
import org.w3c.files.File

object VocaloidMid {
    suspend fun parse(file: File): Project {
        return VsqLike.getMappedTrackData(file, Format.VocaloidMid)
    }

    fun generate(project: Project, features: List<Feature>): ExportResult {
        return VsqLike.getExportResult(project, features, Format.VocaloidMid)
    }
}