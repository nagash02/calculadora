# Calculadora Ácido-Base

## 📖 Descripción
Esta calculadora es una herramienta interactiva diseñada para realizar cálculos químicos asociados a soluciones ácido-base. Permite determinar parámetros fundamentales como:

- pH y pOH
- Concentraciones de iones \([H^+]\) y \([OH^-]\)
- Constantes de acidez (Ka) y basicidad (Kb)
- Porcentaje de disociación
- Resultados de titulaciones ácido-base, incluyendo el punto de equivalencia

Está orientada a estudiantes, docentes y profesionales que requieran agilizar el cálculo y análisis de soluciones, ya sea en un contexto académico o de laboratorio.

---

## 🧪 Funcionalidades
1. **Cálculo de pH y pOH**
   - Para ácidos y bases fuertes (disociación completa).
   - Para ácidos y bases débiles (disociación parcial usando Ka o Kb).

2. **Determinación de Concentraciones**
   - Cálculo directo de \([H^+]\) y \([OH^-]\) a partir de datos de pH o pOH.
   - Conversión entre concentraciones y constantes de equilibrio.

3. **Titulaciones Ácido-Base**
   - Simulación de curvas de titulación.
   - Identificación automática del punto de equivalencia.
   - Soporte para diferentes combinaciones:
     - Ácido fuerte vs base fuerte.
     - Ácido débil vs base fuerte.
     - Base débil vs ácido fuerte.

4. **Análisis Didáctico**
   - Explicación breve del procedimiento seguido en el cálculo.
   - Resultados redondeados con precisión configurable.

---

## ⚙️ Requisitos
- **Backend:** Spring Boot (Java 17+)
- **Frontend:** HTML + Bootstrap + JavaScript
- **Swagger UI** para documentación interactiva del API
- Navegador web moderno para la interfaz

---

## 🚀 Uso
1. **Abrir la interfaz web**
   - Acceder a la dirección del servidor donde se despliegue la calculadora.
   - O utilizar la API vía Swagger UI para integrarla en otras aplicaciones.

2. **Seleccionar el tipo de cálculo**
   - pH/pOH, constantes de equilibrio, titulación.

3. **Ingresar los datos requeridos**
   - Concentración inicial, tipo de ácido/base, Ka/Kb si aplica.

4. **Visualizar resultados**
   - Ver el cálculo detallado y, si es titulación, la curva generada.

---

## 📚 Fundamento Teórico
La calculadora se basa en las definiciones de ácidos y bases de Arrhenius, Brønsted-Lowry y Lewis, empleando:
- Fórmulas logarítmicas para pH/pOH.
- Constantes de equilibrio para ácidos y bases débiles.
- Relaciones estequiométricas en titulaciones.
  
Para más información sobre los fundamentos químicos, ver las referencias citadas en el informe del proyecto.

---

## 👨‍💻 Autor
Cristian Rodrigo González Garcés  
Full Stack Developer & DevOps — AWS Certified Solutions Architect  

---

## 📜 Licencia
Este proyecto es de uso educativo y libre distribución bajo licencia MIT.
