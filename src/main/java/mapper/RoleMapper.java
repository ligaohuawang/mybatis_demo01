package mapper;

import entity.RoleEntity;
//TODO A4 Mapper包括接口和xml文件或接口和注解。这里是接口
public interface RoleMapper {
    public RoleEntity getRoleById(Integer id);
}
