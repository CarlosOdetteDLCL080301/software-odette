# software-odette

Aplicación web construida con **Java 21 + Spring Boot**, **PostgreSQL** y **Docker**.

## 📦 Estructura

- `Dockerfile` – Construcción de la imagen Java.
- `docker-compose.yml` – Orquestación: app + base de datos.
- `src/` – Código fuente Java y recursos.
- `static/index.html` – Frontend estático.
- `.gitignore` – Archivos a ignorar en Git.

## 🚀 Levantar la aplicación

```bash
docker-compose up --build

