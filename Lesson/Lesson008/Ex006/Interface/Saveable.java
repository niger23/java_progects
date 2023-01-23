package Lesson.Lesson008.Ex006.Interface;

import Lesson.Lesson008.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
