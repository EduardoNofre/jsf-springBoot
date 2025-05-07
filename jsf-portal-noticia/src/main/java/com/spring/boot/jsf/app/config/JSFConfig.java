package com.spring.boot.jsf.app.config;

import jakarta.faces.annotation.FacesConfig;
import jakarta.enterprise.context.ApplicationScoped;

@FacesConfig(
    // Ativa o modo compatível com JSF 2.3 (opcional, útil para CDI etc.)
    version = FacesConfig.Version.JSF_2_3
)
@ApplicationScoped
public class JSFConfig {
    // Esta classe serve apenas para ativar o JSF no contexto do Jakarta EE com CDI
}