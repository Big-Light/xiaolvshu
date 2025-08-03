package com.xcf.xls.note.biz.service;


import com.xcf.response.Response;
import com.xcf.xls.note.biz.model.VO.PublishNoteReqVO;

/**

 * @description: 笔记业务
 **/
public interface NoteService {

    /**
     * 笔记发布
     * @param publishNoteReqVO
     * @return
     */
    Response<?> publishNote(PublishNoteReqVO publishNoteReqVO);

}
