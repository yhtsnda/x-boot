package cn.exrick.xboot.entity;

import cn.exrick.xboot.base.XbootBaseEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Exrickx
 */
@Data
@Entity
@Table(name = "t_role")
@TableName("t_role")
public class Role extends XbootBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色名 以ROLE_开头")
    private String name;

    @ApiModelProperty(value = "对应权限值 权限菜单所需")
    private Integer access;

    @ApiModelProperty(value = "是否为注册默认角色")
    private Boolean defaultRole;

}
