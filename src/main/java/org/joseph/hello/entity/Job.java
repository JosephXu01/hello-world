package org.joseph.hello.entity;

    import java.time.LocalDateTime;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author Joseph
* @since 2019-06-21
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String status;

        @TableField("createdTime")
    private LocalDateTime createdTime;

    private String content;

    private String subject;

        @TableField("finishTime")
    private LocalDateTime finishTime;


}
