package com.nyb.warehouse.modelmapper;

import com.nyb.warehouse.entity.User;
import com.nyb.warehouse.viewmodel.WebUser;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by aa on 2016/12/9.
 */
@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    WebUser entityToViewModel(User entity);

    User viewModelToEntity(WebUser viewModel);

    List<WebUser> entityToViewModels(List<User> entities);
}
