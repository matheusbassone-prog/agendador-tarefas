package com.javanauta.agendador_tarefas.business.dto;

import com.javanauta.agendador_tarefas.infrastructure.client.UsuarioClient;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO{

    private String email;
    private String senha;

}
