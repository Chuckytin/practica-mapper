# Prácticas de Mapeo de Objetos en Java

Las prácticas de mapeo de objetos son fundamentales en el desarrollo de software, especialmente cuando se trabaja con aplicaciones que requieren la conversión entre diferentes representaciones de datos. Estas conversiones son comunes en situaciones como:

- **Interacción con bases de datos**: Convertir entidades de la base de datos a objetos de negocio y viceversa.
- **Interacción con APIs**: Convertir objetos de respuesta de API a modelos internos.
- **Validación y transformación de datos**: Adaptar los datos para cumplir con diferentes requisitos de validación o formato.

### Enfoques Utilizados

Este proyecto es una práctica de mapeo de objetos en Java utilizando tres bibliotecas: **MapStruct**, **ModelMapper** y **OrikaMapper**. 

#### 1. **MapStruct**

MapStruct es un generador de mapeo de Java que utiliza anotaciones para definir las conversiones entre tipos de objetos. Sus principales características incluyen:

- **Alto rendimiento**: Genera código de mapeo en tiempo de compilación, lo que resulta en un rendimiento superior al de las soluciones basadas en reflexión.
- **Simplicidad**: La configuración es clara y concisa mediante anotaciones, lo que facilita su uso.
- **Flexibilidad**: Permite personalizar el mapeo y manejar conversiones complejas con facilidad.

#### 2. **ModelMapper**

ModelMapper es una biblioteca de mapeo de objetos que permite la conversión entre tipos de objetos a través de configuraciones sencillas. Sus características son:

- **Configuración dinámica**: Permite definir mapeos utilizando configuraciones en tiempo de ejecución, lo que facilita el ajuste a diferentes estructuras de objetos.
- **Resolución automática**: Realiza la asignación de propiedades de manera automática basándose en nombres similares, lo que reduce la necesidad de configuraciones manuales.
- **Conveniente para escenarios sencillos**: Ideal para proyectos donde se requiere un mapeo rápido y sencillo sin mucha personalización.

#### 3. **OrikaMapper**

Orika es una biblioteca de mapeo de objetos que se enfoca en el rendimiento y la flexibilidad. Algunas de sus características incluyen:

- **Soporte para colecciones y tipos complejos**: Puede manejar la conversión de colecciones y estructuras de datos anidadas de manera eficiente.
- **Configuración fluida**: Ofrece una API fluida que permite definir mapeos de manera declarativa.
- **Capacidad de personalización**: Permite definir lógica de mapeo personalizada, lo que la hace adecuada para aplicaciones más complejas.

## Tecnologías utilizadas

- **Java 1.8**
- **MapStruct**
- **ModelMapper**
- **OrikaMapper**
- **Maven** como herramienta de construcción

## Dependencias

Se han añadido las dependencias necesarias para **ModelMapper**, **MapStruct** y **OrikaMapper** en el archivo de configuración de Maven.

## Clases Implementadas

### DTOs

- **PersonDefaultDTO**: Contiene atributos básicos de la persona.
- **PersonCustomDTO**: Contiene atributos personalizados, con el sufijo "DTO" para diferenciarlos.

### Entidad

- **Person**: Representa la entidad principal con atributos como `id`, `name`, `lastName`, `email`, `age`, y `gender`.

### Mapper

- **PersonMapper**: Interfaz que define los métodos de mapeo entre `Person` y sus respectivos DTOs utilizando anotaciones de MapStruct.

### Clase Principal

- **Main**: Contiene métodos de prueba que demuestran el uso de los mapeadores para convertir objetos `Person` a sus correspondientes DTOs.
