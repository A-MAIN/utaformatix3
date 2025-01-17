package ui.strings

import io.MusicXml.MUSIC_XML_VERSION
import ui.strings.Language.English
import ui.strings.Language.Japanese
import ui.strings.Language.Russian
import ui.strings.Language.SimplifiedChinese

enum class Strings(val en: String, val ja: String, val zhCN: String, val ru: String) {
    LanguageDisplayName(
        en = English.displayName,
        ja = Japanese.displayName,
        zhCN = SimplifiedChinese.displayName,
        ru = Russian.displayName
    ),
    ReportFeedbackTooltip(
        en = "Send feedback",
        ja = "フィードバックを送信",
        zhCN = "提交反馈",
        ru = "Отправить отзыв"
    ),
    FrequentlyAskedQuestionTooltip(
        en = "Frequently Asked Questions",
        ja = "よくある質問",
        zhCN = "常见问题解答",
        ru = "Часто задаваемые вопросы"
    ),
    ImportProjectCaption(
        en = "Import Project",
        ja = "プロジェクトをインポート",
        zhCN = "导入工程",
        ru = "Импортировать проект"
    ),
    SelectOutputFormatCaption(
        en = "Select Output Format",
        ja = "出力形式を選ぶ",
        zhCN = "选择输出格式",
        ru = "Выберите выходной формат"
    ),
    ConfigurationEditorCaption(
        en = "Configuration",
        ja = "設定",
        zhCN = "设置",
        ru = "Конфигурация"
    ),
    ExportCaption(
        en = "Export",
        ja = "エクスポート",
        zhCN = "导出",
        ru = "Экспорт"
    ),
    ExporterTitleSuccess(
        en = "Process finished successfully.",
        ja = "処理に成功しました。",
        zhCN = "处理已完成。",
        ru = "Процесс успешно завершен"
    ),
    LyricsTypeUnknown(
        en = "Unknown",
        ja = "不明",
        zhCN = "未知",
        ru = "Неизвестно"
    ),
    LyricsTypeRomajiCV(
        en = "Romaji CV",
        ja = "単独音（ローマ字）",
        zhCN = "罗马字单独音",
        ru = "Ромадзи CV"
    ),
    LyricsTypeRomajiVCV(
        en = "Romaji VCV",
        ja = "連続音（ローマ字）",
        zhCN = "罗马字连续音",
        ru = "Ромадзи VCV"
    ),
    LyricsTypeKanaCV(
        en = "Kana CV",
        ja = "単独音（ひらがな）",
        zhCN = "假名单独音",
        ru = "Кана CV"
    ),
    LyricsTypeKanaVCV(
        en = "Kana VCV",
        ja = "連続音（ひらがな）",
        zhCN = "假名连续音",
        ru = "Кана VCV"
    ),
    JapaneseLyricsConversionSwitchLabel(
        en = "Cleanup and convert lyrics (only for Japanese lyrics)",
        ja = "歌詞のSuffix除去・変換（日本語歌詞のみ対応）",
        zhCN = "清理并转换歌词（仅日语）",
        ru = "Очистка и преобразование текстов (только для японских текстов)"
    ),
    FromLyricsTypeLabel(
        en = "Original lyrics type (analysis result: {{type}})",
        ja = "変換元の歌詞タイプを選択（分析結果：{{type}}）",
        zhCN = "原歌词类型（分析结果为：{{type}}）",
        ru = "Исходный тип текстов (результат анализа: {{type}})"
    ),
    ToLyricsTypeLabel(
        en = "Target lyrics type",
        ja = "変換先の歌詞タイプを選択",
        zhCN = "目标歌词类型",
        ru = "Целевой тип текстов"
    ),
    ConvertPitchData(
        en = "Convert pitch parameters",
        ja = "ピッチパラメータを変換",
        zhCN = "转换音高参数",
        ru = "Конвертировать параметры питча"
    ),
    ConvertPitchDataDescription(
        en = "It may take some time to process with this option.",
        ja = "処理に時間がかかることがあります。",
        zhCN = "该选项可能会增加处理时间。",
        ru = "Обработка с помощью этого параметра может занять некоторое время."
    ),
    ProjectZoom(
        en = "Zoom in/out project",
        ja = "プロジェクトをズームイン・ズームアウト",
        zhCN = "缩放工程",
        ru = "Приблизить/отдалить проект"
    ),
    ProjectZoomDescription(
        en = "Change Bpm and notes in parallel so that the actual singing speed is kept. For example," +
            "with factor 2, 60 bpm becomes 120 bpm and all notes become twice the length",
        ja = "実際の速度を変更しないようBpmやノートなどを同時に変更します。例えば、60 bmpの曲に因子2をかけると、" +
            "120 bpm になり、すべてのノートの長さも二倍になります。",
        zhCN = "在不改变实际曲速的前提下同时改变Bpm数值与音符长度。例如，在60 bpm的乐曲中使用2倍的缩放，则乐曲变为120bpm，" +
            "同时所有音符的长度也翻倍。",
        ru = "Изменение частоты ударов в минуту и нот параллельно, чтобы сохранить фактическую скорость пения." +
            " Например, с коэффициентом 2 60 ударов в минуту становятся 120 ударов в минуту," +
            " и все ноты становятся в два раза длиннее"
    ),
    ProjectZoomWarning(
        en = "Current settings may be destructive because some time signatures have to be moved to measure heads.",
        ja = "この設定ではプロジェクトを適切に変換できないことがあります。一部の拍子記号を小節の始まりに移動させることになります。",
        zhCN = "该设定可能无法正确转换本工程。一部分的节拍记号将被移动到最近的小节的开始位置。",
        ru = "Текущие настройки могут быть разрушительными," +
            " поскольку для измерения головок необходимо переместить некоторые временные сигнатуры."
    ),
    ProjectZooLabel(
        en = "Factor",
        ja = "因子",
        zhCN = "系数",
        ru = "Коэффицент"
    ),
    NextButton(
        en = "Next",
        ja = "次へ",
        zhCN = "下一步",
        ru = "Далее"
    ),
    CancelButton(
        en = "Cancel",
        ja = "キャンセル",
        zhCN = "取消",
        ru = "Назад"
    ),
    ReportButton(
        en = "Report",
        ja = "問題を報告",
        zhCN = "提交报告",
        ru = "Сообщить"
    ),
    ImportFileDescription(
        en = "Drop files or Click to import",
        ja = "ファイルをドロップするか、クリックしてインポート",
        zhCN = "拖放文件或点击导入",
        ru = "Перетащите файлы или нажмите, чтобы импортировать"
    ),
    ImportFileSubDescription(
        en = "Supported file types: VSQX, VPR, VSQ, MID(VOCALOID), USTs," +
            " USTX, CCS, MUSICXML, XML, SVP, S5P, DV, PPSF(NT)",
        ja = "サポートされているファイル形式：VSQX、VPR、VSQ、MID（VOCALOID）、UST（複数可）、" +
            "USTX、CCS、MUSICXML、XML、SVP、S5P、DV、PPSF（NT）",
        zhCN = "支持的文件类型：VSQX、VPR、VSQ、MID（VOCALOID）、UST（允许复数个）、" +
            "USTX、CCS、MUSICXML、XML、SVP、S5P、DV、PPSF（NT）",
        ru = "Поддерживаемые форматы файлов: VSQx, VPR, VSQ, MID (VOCALOID), UST," +
            " USTX, CCS, MusicXML, XML, SVP, S5P, DV, PPSF(NT)"
    ),
    UnsupportedFileTypeImportError(
        en = "Unsupported file type",
        ja = "サポートされていないファイル形式です",
        zhCN = "不支持的文件类型",
        ru = "Неподдерживаемый формат файла"
    ),
    MultipleFileImportError(
        en = "Multiple files of {{format}} could not be imported in one go",
        ja = "複数の{{format}}ファイルを一度にインポートすることはできません",
        zhCN = "无法同时导入多个{{format}}文件",
        ru = "Несколько файлов {{format}} не удалось импортировать за один раз"
    ),
    ImportErrorDialogTitle(
        en = "Failed to import the project",
        ja = "プロジェクトのインポートに失敗しました",
        zhCN = "无法导入该工程",
        ru = "Не удалось импортировать проект"
    ),
    ProcessErrorDialogTitle(
        en = "An error happened during the process",
        ja = "処理中に下記のエラーが発生しました",
        zhCN = "在处理中发生了以下错误",
        ru = "Во время процесса произошла ошибка"
    ),
    ErrorDialogDescription(
        en = "If you find any problems, please help us collect error information" +
            " for better performance of this application by submitting a feedback report.",
        ja = "サービス向上のためにエラー情報を収集しております。問題を発見した場合、フィードバックにご協力をお願いします。",
        zhCN = "如您在使用中发现问题，您可以向我们提交反馈表单。感谢您对本应用的改善所提供的帮助！",
        ru = "Если вы обнаружите какие-либо проблемы, пожалуйста, помогите нам собрать информацию об ошибках" +
            "  для повышения производительности этого приложения, отправив отчет об обратной связи."
    ),
    ReportUrl(
        en = "https://forms.gle/3Es3ZomcYKNHWBvp6",
        ja = "https://forms.gle/kDY9chZBjGATXqpE8",
        zhCN = "https://forms.gle/nJVdrsfwMhbNXEYUA",
        ru = "https://forms.gle/vTNUE78QzURB7YcBA"
    ),
    FaqUrl(
        en = "https://gist.githubusercontent.com/sdercolin/4d835e7e201a39504f5321f67d254209/raw",
        ja = "https://gist.githubusercontent.com/sdercolin/f1de7c1f7a894f1fc8f77b17f3e8f77d/raw",
        zhCN = "https://gist.githubusercontent.com/sdercolin/1a940a1357e2a6a5c10561482536bdba/raw",
        ru = "https://gist.githubusercontent.com/KagamineP/d5837aa5f1b3be3b05aed5cd63b2afe2/raw"
    ),
    ReleaseNotesUrl(
        en = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        ja = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        zhCN = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw",
        ru = "https://gist.githubusercontent.com/sdercolin/512db280480072f22cf1d462401eb1a0/raw"
    ),
    ImportWarningTitle(
        en = "The following exceptions happened during the import process.",
        ja = "インポート中に下記の例外が発生しました。",
        zhCN = "导入过程中出现了下列异常。",
        ru = "В процессе импорта произошли следующие исключения."
    ),
    ImportWarningTempoNotFound(
        en = "- No tempo labels found in the imported project.",
        ja = "- テンポ記号が見つかりませんでした。",
        zhCN = "- 在导入的工程中未找到速度记号。",
        ru = "- Метки темпа не найдены в импортированном проекте."
    ),
    ImportWarningTempoIgnoredInFile(
        en = "- Tempo label ({{bpm}}) at tick {{tick}} in file [{{file}}] was ignored.",
        ja = "- ファイル[{{file}}]の tick {{tick}} にあるテンポ記号（{{bpm}}）を読み込めませんでした。",
        zhCN = "- 未能读取文件[{{file}}]中 tick {{tick}} 处的速度记号（{{bpm}}）。",
        ru = "- Метка темпа ({{bpm}}) на отметке {{tick}} в файле [{{file}}] была проигнорирована."
    ),
    ImportWarningTempoIgnoredInTrack(
        en = "- Tempo label ({{bpm}}) at tick {{tick}} in Track {{number}}: [{{name}}] was ignored.",
        ja = "- トラック{{number}}：[{{name}}]のtick {{tick}}にあるテンポ記号（{{bpm}}）を読み込めませんでした。",
        zhCN = "- 未能读取音轨{{number}}：[{{name}}]中tick {{tick}}处的速度记号（{{bpm}}）。",
        ru = "- Метка темпа ({{bpm}}) на отметке {{tick}} в треке {{number}}: [{{name}}] была проигнорирована."
    ),
    ImportWarningTempoIgnoredInPreMeasure(
        en = "- Tempo label ({{bpm}}) in pre-measures was ignored.",
        ja = "- プリメジャーにあるテンポ記号（{{bpm}}）を読み込めませんでした。",
        zhCN = "- 未能读取前置小节中的速度记号（{{bpm}}）。",
        ru = "- Метка темпа ({{bpm}}) в предварительных мерах была проигнорирована."
    ),
    ImportWarningTimeSignatureNotFound(
        en = "- No time signature labels found in the imported project.",
        ja = "- 拍子記号が見つかりませんでした。",
        zhCN = "- 在导入的工程中未找到节拍记号。",
        ru = "- В импортированном проекте не найдено меток временных сигнатур."
    ),
    ImportWarningTimeSignatureIgnoredInTrack(
        en = "- Time signature label ({{timeSignature}}) at measure {{measure}}" +
            " in Track {{number}}: [{{name}}] was ignored.",
        ja = "- トラック{{number}}：[{{name}}]の小節{{measure}}にある拍子記号（{{timeSignature}}）を読み込めませんでした。",
        zhCN = "- 未能读取音轨{{number}}: [{{name}}]中小节{{measure}}处的节拍记号（{{timeSignature}}）。",
        ru = "- Метка временной сигнатуры ({{TimeSignature}}) при измерении {{measure}}" +
            " в треке {{number}}: [{{name}}] была проигнорирована."
    ),
    ImportWarningTimeSignatureIgnoredInPreMeasure(
        en = "- Time signature label ({{timeSignature}}) in pre-measures was ignored.",
        ja = "- プリメジャーにある拍子記号（{{timeSignature}}）を読み込めませんでした。",
        zhCN = "- 未能读取前置小节中的节拍记号（{{timeSignature}}）。",
        ru = "- Метка временной сигнатуры ({{timeSignature}}) в предварительных мерах была проигнорирована."
    ),
    VsqxFormatDescription(
        en = "Project for VOCALOID4",
        ja = "VOCALOID4 プロジェクト",
        zhCN = "VOCALOID4 工程",
        ru = "Проект для VOCALOID4"
    ),
    VprFormatDescription(
        en = "Project for VOCALOID5",
        ja = "VOCALOID5 プロジェクト",
        zhCN = "VOCALOID5 工程",
        ru = "Проект для VOCALOID5"
    ),
    UstFormatDescription(
        en = "Project for UTAU",
        ja = "UTAU プロジェクト",
        zhCN = "UTAU 工程",
        ru = "Проект для UTAU"
    ),
    UstxFormatDescription(
        en = "Project for OpenUtau",
        ja = "OpenUtau プロジェクト",
        zhCN = "OpenUtau 工程",
        ru = "Проект для OpenUtau"
    ),
    CcsFormatDescription(
        en = "Project for CeVIO Creative Studio",
        ja = "CeVIO Creative Studio プロジェクト",
        zhCN = "CeVIO Creative Studio 工程",
        ru = "Проект для CeVIO Creative Studio"
    ),
    SvpFormatDescription(
        en = "Project for Synthesizer V Studio",
        ja = "Synthesizer V Studio プロジェクト",
        zhCN = "Synthesizer V Studio 工程",
        ru = "Проект для Synthesizer V Studio"
    ),
    S5pFormatDescription(
        en = "Project for Synthesizer V",
        ja = "Synthesizer V プロジェクト",
        zhCN = "Synthesizer V 工程",
        ru = "Проект для Synthesizer V"
    ),
    MusicXmlFormatDescription(
        en = "MusicXML $MUSIC_XML_VERSION (CeVIO style)",
        ja = "MusicXML $MUSIC_XML_VERSION （CeVIO基準に準じる）",
        zhCN = "MusicXML $MUSIC_XML_VERSION（参照CeVIO标准）",
        ru = "MusicXML $MUSIC_XML_VERSION (стиль CeVIO)"
    ),
    DvFormatDescription(
        en = "Project for DeepVocal",
        ja = "DeepVocal プロジェクト",
        zhCN = "DeepVocal 工程",
        ru = "Проект для DeepVocal"
    ),
    VsqFormatDescription(
        en = "Project for VOCALOID2",
        ja = "VOCALOID2 プロジェクト",
        zhCN = "VOCALOID2 工程",
        ru = "Проект для VOCALOID2"
    ),
    VocaloidMidiFormatDescription(
        en = "Project for VOCALOID1",
        ja = "VOCALOID1 プロジェクト",
        zhCN = "VOCALOID1 工程",
        ru = "Проект для VOCALOID1"
    ),
    ExportButton(
        en = "Export",
        ja = "エクスポート",
        zhCN = "导出",
        ru = "Экспортировать"
    ),
    RestartButton(
        en = "Back to the beginning",
        ja = "プロジェクトインポート画面に戻る",
        zhCN = "回到初始页面",
        ru = "Вернуться на главную"
    ),
    ExportNotificationPhonemeResetRequiredVSQ(
        en = "Phonemes of all notes were set to \"a\". Please reset them to make it sound correctly.",
        ja = "全てのノートの発音記号が\"a\"に設定されました。正確に発音させるには発音記号をリセットしてください。",
        zhCN = "所有音符的音素都被设为了\"a\"。请重置音素以使其正确发音。",
        ru = "Фонемы всех нот были установлены на \"a\"." +
            " Пожалуйста, сбросьте их, чтобы они звучали правильно."
    ),
    ExportNotificationPhonemeResetRequiredV4(
        en = "Phonemes of all notes were set to \"a\"." +
            " Please use \"Lyrics\" -> \"Convert Phonemes\" in the menu of VOCALOID4 to reset them.",
        ja = "全てのノートの発音記号が\"a\"に設定されました。" +
            "VOCALOID4のメニューから「歌詞」->「発音記号変換」機能で発音記号をリセットしてください。",
        zhCN = "所有音符的音素都被设为了\"a\"。请使用VOCALOID4菜单中的「歌词」->「音位变换」功能来重置音素。",
        ru = "Фонемы всех нот были установлены на \"a\"." +
            " Пожалуйста, воспользуйтесь \"Lyrics\" -> \"Convert Phonemes\" в меню VOCALOID4 чтобы сбросить их."
    ),
    ExportNotificationPhonemeResetRequiredV5(
        en = "Phonemes of all notes were set to \"a\". Please use \"Job\" -> \"Convert Phonemes to Match Languages\"" +
            " in the menu of VOCALOID5 to reset them.",
        ja = "全てのノートの発音記号が\"a\"に設定されました。" +
            "VOCALOID5のメニューから「ジョブ」->「発音記号を言語に合わせて変換」機能で発音記号をリセットしてください。",
        zhCN = "所有音符的音素都被设为了\"a\"。请使用VOCALOID5菜单中的「任务」->「发音符号匹配」功能来重置音素。",
        ru = "Фонемы всех нот были установлены на \"a\"." +
            " Пожалуйста, воспользуйтесь \"Job\" -> \"Convert Phonemes to Match Languages\"" +
            " в меню VOCALOID5 чтобы сбросить их."
    ),
    ExportNotificationTempoChangeIgnored(
        en = "Could not convert tempo changes to the target format.",
        ja = "テンポの変更を出力することができませんでした。",
        zhCN = "未能将速度的变化导出到目标格式。",
        ru = "Невозможно конвертировать изменения темпа в целевой формат."
    ),
    ExportNotificationTimeSignatureIgnored(
        en = "Could not convert time signatures to the target format.",
        ja = "拍子記号を出力することができませんでした。",
        zhCN = "未能将节拍记号导出到目标格式。",
        ru = "Не удалось преобразовать временные сигнатуры в целевой формат."
    ),
    ExportNotificationTimeSignatureChangeIgnored(
        en = "Could not convert time signature changes to the target format.",
        ja = "拍子記号の変更を出力することができませんでした。",
        zhCN = "未能将节拍记号的变化导出到目标格式。",
        ru = "Не удалось преобразовать изменения временной сигнатуры в целевой формат."
    ),
    ExportNotificationPitchDataExported(
        en = "Some pitch parameters were exported. For a higher reproduction accuracy," +
            " you may need to turn off pitch transition and vibrato settings in the target editor.",
        ja = "ピッチパラメータが出力されました。出力側のエディターでピッチ推移やビブラートなどの設定を削除することで、より高い精度でピッチを" +
            "再現できる場合があります。",
        zhCN = "生成的文件中带有音高参数。您可能需要在对象编辑器中关闭音高平滑设置及颤音设置以达到更高的重现精度。",
        ru = "Некоторые параметры высоты тона были экспортированы. Для более высокой точности" +
            "воспроизведения, возможно вам потребуется отключить настройки высоты тона и" +
            " вибрато в целевом редакторе."
    ),
    ExportNotificationDataOverLengthLimitIgnored(
        en = "Data exceeding length limit ignored. Please check if your output includes all your intended data.",
        ja = "一部のデータが長さ制限を超えているため、すべてのデータを出力することができませんでした。意図したデータが出力結果にすべて" +
            "入っているかどうかを確認してください。",
        zhCN = "部分数据超过了长度限制而被忽略，请检查生成的文件是否完整包含您所需要的数据。",
        ru = "Данные, превышающие предельную длину, игнорируются. Пожалуйста, проверьте," +
            " включает ли ваш вывод все предполагаемые данные."
    ),
    SlightRestsFillingSwitchLabel(
        en = "Fill short rests",
        ja = "短い休符を埋める",
        zhCN = "填充短休止符",
        ru = "Заполнить короткие промежутки"
    ),
    SlightRestsFillingDescription(
        en = "Extend note to fill the short rest between it and its next note",
        ja = "ノート同士の間に短い休符が挟まっている場合、前のノートを伸ばして隙間を埋めます",
        zhCN = "当音符之间存在较短的休止符时，将前一个音符延长来填充休止符",
        ru = "Расширить ноту, чтобы заполнить короткий промежуток между ней и следующей нотой"
    ),
    SlightRestsFillingThresholdLabel(
        en = "Max length to be processed (exclusive)",
        ja = "長さが入力値未満の場合処理",
        zhCN = "适用该处理的最大长度（不含）",
        ru = "Максимальная длина, подлежащая обработке (исключительная)"
    ),
    SlightRestsFillingThresholdItem(
        en = "1/{{denominator}} note",
        ja = "{{denominator}}分音符",
        zhCN = "{{denominator}}分音符",
        ru = "1/{{denominator}} ноты"
    ),
    UseSimpleImport(
        en = "Simple Import",
        ja = "シンプルインポート",
        zhCN = "简单导入",
        ru = "Простой импорт"
    ),
    UseSimpleImportDescription(
        en = "Ignore detail parameters to accelerate importing",
        ja = "パラメータをインポートしないことで、より早くインポートする",
        zhCN = "忽略参数，使导入更快",
        ru = "Игнорировать подробные параметры для ускорения импорта"
    );

    fun get(language: Language): String = when (language) {
        English -> en
        Japanese -> ja
        SimplifiedChinese -> zhCN
        Russian -> ru
    }
}

fun string(key: Strings, vararg params: Pair<String, String>): String {
    val options = object {}.asDynamic()
    params.forEach { (key, value) ->
        options[key] = value
    }
    return i18next.t(key.name, options) as String
}
