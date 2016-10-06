package com.kkk.pattern.undoCommand;

/**
 * Created by kkk on 2016/9/10.
 */
public interface UndoOrRedo {
    void exercute();
    void undo();
    void redo();
}
