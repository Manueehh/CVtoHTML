import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import model.*;

public class PortfolioHTMLGenerator {

        public void saveToFile(CV cv, String filePath) throws IOException {
                String htmlContent = generateHTML(cv);

                // Crear directorio si no existe
                Path path = Paths.get(filePath);
                Path parentDir = path.getParent();
                if (parentDir != null) {
                        Files.createDirectories(parentDir);
                }

                try (FileWriter writer = new FileWriter(filePath)) {
                        writer.write(htmlContent);
                }
        }

        public String generateHTML(CV cv) {
                StringBuilder html = new StringBuilder();

                Persona persona = cv.getDatosPersonales();
                List<HardSkill> hardSkills = cv.getHardSkills();
                SoftSkill softSkills = cv.getSoftSkills();
                List<Idioma> idiomas = cv.getIdiomas();
                Map<String, List<? extends Formacion>> formacion = cv.getFormacion();
                List<ExperienciaItem> experiencia = cv.getExperiencia();
                List<Proyecto> portfolio = cv.getPortfolio();

                // Header
                html.append("<!DOCTYPE html>\n");
                html.append("<html lang=\"en\">\n");
                html.append(generateHead(persona));
                html.append("<body>\n");

                // Loader
                html.append(generateLoader());

                // Header
                html.append(generateHeader());

                // Sidebar
                html.append(generateSidebar());

                // Hero Section
                html.append(generateHeroSection(persona));

                // About Section
                html.append(generateAboutSection(persona));

                // Habilidades (Skills)
                html.append(generateSkillsSection(hardSkills, softSkills));

                // Idiomas (Languages)
                html.append(generateLanguagesSection(idiomas));

                // Formación (Education)
                html.append(generateEducationSection(formacion));

                // Experiencia (Experience)
                html.append(generateExperienceSection(experiencia));

                // Portfolio
                if (portfolio != null && !portfolio.isEmpty()) {
                        html.append(generatePortfolioSection(portfolio));
                }

                // Counter (basado en experiencia y proyectos)
                html.append(generateCounterSection(experiencia, portfolio));

                // News (sección opcional - estática por ahora)
                html.append(generateNewsSection());

                // Contact
                html.append(generateContactSection(persona));

                // Footer
                html.append(generateFooter());

                // Scripts
                html.append(generateScripts());

                html.append("</body>\n</html>");

                return html.toString();
        }

        private String generateHead(Persona persona) {
                String nombre = (persona != null && persona.getNombre() != null) ? persona.getNombre() : "Portfolio";
                String puesto = (persona != null && persona.getPuesto() != null) ? persona.getPuesto() : "Professional";

                return "<head>\n" +
                                "    <meta charset=\"UTF-8\">\n" +
                                "    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n" +
                                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n"
                                +
                                "    <title>" + nombre + " - " + puesto + "</title>\n" +
                                "    <meta name=\"description\" content=\"Personal Portfolio of " + nombre + "\">\n" +
                                "    <meta name=\"author\" content=\"" + nombre + "\">\n" +
                                "    <!-- CSS imports -->\n" +
                                "    <link rel=\"stylesheet\" href=\"assets/css/plugins/bootstrap.css\">\n" +
                                "    <link rel=\"stylesheet\" href=\"assets/css/plugins/jquery.fancybox.min.css\">\n" +
                                "    <link rel=\"stylesheet\" href=\"assets/css/plugins/slick.min.css\">\n" +
                                "    <link rel=\"stylesheet\" href=\"assets/css/dark.css\">\n" +
                                "    <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n" +
                                "</head>\n";
        }

        private String generateLoader() {
                return "<!-- Loader -->\n" +
                                "<div id=\"ms-overlay\">\n" +
                                "    <div class=\"ms-roller\">\n" +
                                "        <div></div><div></div><div></div><div></div>\n" +
                                "        <div></div><div></div><div></div><div></div>\n" +
                                "    </div>\n" +
                                "</div>\n";
        }

        private String generateHeader() {
                return "<!-- Header Start -->\n" +
                                "<header>\n" +
                                "    <nav>\n" +
                                "        <a href=\"javascript:void(0)\" class=\"ms-sidebar-toggle\">" +
                                "<img src=\"assets/img/icons/menu.svg\" class=\"svg_img\" alt=\"menu\"></a>\n" +
                                "    </nav>\n" +
                                "</header>\n" +
                                "<!-- Header End -->\n";
        }

        private String generateSidebar() {
                return "<!-- Sidebar Start -->\n" +
                                "<div class=\"ms-sidebar-overlay\"></div>\n" +
                                "<div class=\"ms-sidebar\">\n" +
                                "    <div class=\"menu-list\">\n" +
                                "        <a href=\"javascript:void(0)\" class=\"close-sidebar\">×</a>\n" +
                                "        <ul class=\"navbar-nav mb-2 ml-auto\" id=\"top-menu\">\n" +
                                "            <li class=\"nav-item active\"><a class=\"nav-link ms-nav\" href=\"#home\">Home</a></li>\n"
                                +
                                "            <li class=\"nav-item\"><a class=\"nav-link ms-nav\" href=\"#about\">About</a></li>\n"
                                +
                                "            <li class=\"nav-item\"><a class=\"nav-link ms-nav\" href=\"#skills\">Habilidades</a></li>\n"
                                +
                                "            <li class=\"nav-item\"><a class=\"nav-link ms-nav\" href=\"#languages\">Idiomas</a></li>\n"
                                +
                                "            <li class=\"nav-item\"><a class=\"nav-link ms-nav\" href=\"#education\">Formación</a></li>\n"
                                +
                                "            <li class=\"nav-item\"><a class=\"nav-link ms-nav\" href=\"#experience\">Experiencia</a></li>\n"
                                +
                                "            <li class=\"nav-item\"><a class=\"nav-link ms-nav\" href=\"#portfolio\">Portfolio</a></li>\n"
                                +
                                "        </ul>\n" +
                                "    </div>\n" +
                                "</div>\n" +
                                "<!-- Sidebar End -->\n";
        }

        private String generateHeroSection(Persona persona) {
                if (persona == null)
                        return "";

                String nombre = persona.getNombre() != null ? persona.getNombre() : "Your Name";
                String puesto = persona.getPuesto() != null ? persona.getPuesto() : "Your Title";
                String imagenPerfil = persona.getImagenPerfil() != null ? persona.getImagenPerfil()
                                : "assets/img/hero/my-img-dark.png";

                return "<!-- Hero Start -->\n" +
                                "<section id=\"home\" class=\"ms-hero margin-b-50\">\n" +
                                "    <div class=\"ms-diamond-1\"></div>\n" +
                                "    <div class=\"ms-diamond-2\"></div>\n" +
                                "    <div class=\"ms-diamond-3\"></div>\n" +
                                "    <div class=\"ms-diamond-4\"></div>\n" +
                                "    <div class=\"ms-diamond-5\"></div>\n" +
                                "    <div class=\"ms-diamond-6\"></div>\n" +
                                "    <div class=\"container\">\n" +
                                "        <div class=\"hero-content\">\n" +
                                "            <div class=\"hero-item static\">\n" +
                                "                <div class=\"ms-hero-detail\">\n" +
                                "                    <h2 class=\"ms-hero-title title-right-overflow\">" +
                                "<span>Hello, <br> I am<br> <span class=\"name\">&nbsp; " +
                                nombre + "</span></span></h2>\n" +
                                "                    <p class=\"ms-hero-detail\">" + puesto + "</p>\n" +
                                "                    <a href=\"#\" class=\"ms-learn-more-right\">\n" +
                                "                        <span class=\"text\">Download CV</span>\n" +
                                "                    </a>\n" +
                                "                </div>\n" +
                                "                <div class=\"ms-hero-img\" style=\"margin-left: 50px;\">\n" +
                                "                    <div class=\"ms-card\" data-tilt>\n" +
                                "                        <img src=\"" + imagenPerfil + "\" alt=\"" + nombre + "\">\n" +
                                "                    </div>\n" +
                                "                </div>\n" +
                                "                <div class=\"ms-hero-name\">\n" +
                                "                    <h3><span>" + puesto + "</span></h3>\n" +
                                "                </div>\n" +
                                "            </div>\n" +
                                "            <div class=\"art\"></div>\n" +
                                "        </div>\n" +
                                "    </div>\n" +
                                "    <div class=\"scroll-next\" data-scroll=\"about\">\n" +
                                "        <div class=\"ms-container\">\n" +
                                "            <span class=\"menu\">\n" +
                                "                <span class=\"text\"></span>\n" +
                                "                <span class=\"circle\"></span>\n" +
                                "            </span>\n" +
                                "        </div>\n" +
                                "    </div>\n" +
                                "</section>\n" +
                                "<!-- Hero End -->\n";
        }

        private String generateAboutSection(Persona persona) {
                if (persona == null)
                        return "";

                StringBuilder about = new StringBuilder();
                about.append("<!-- About section -->\n")
                                .append("<section id=\"about\" class=\"ms-about padding-tb-80 sec-bg\">\n")
                                .append("    <div class=\"container\">\n")
                                .append("        <div class=\"row\">\n")
                                .append("            <div class=\"section-title\">\n")
                                .append("                <h2>Sobre<span> mí</span></h2>\n")
                                .append("                <span class=\"ligh-title\">Sobre mí</span>\n")
                                .append("            </div>\n")
                                .append("            <div class=\"col-lg-12\">\n")
                                .append("                <div class=\"ms-about-detail m-b-991\">\n")
                                .append("                    <h4>Resumen profesional</h4>\n")
                                .append("                    <p class=\"ms-text\">"
                                                + (persona.getPuesto() != null ? persona.getPuesto() : "Professional")
                                                + " con pasión por crear soluciones innovadoras.</p>\n")
                                .append("                    <div class=\"ms-about-info\">\n")
                                .append("                        <ul class=\"m-r-30\">\n")
                                .append("                            <li><span class=\"title\">Nombre<b>:</b></span>"
                                                + persona.getNombre() + "</li>\n");

                // Edad o fecha de nacimiento
                if (persona.getEdad() != null) {
                        about.append("                            <li><span class=\"title\">Edad<b>:</b></span>"
                                        + persona.getEdad()
                                        + " Años</li>\n");
                } else if (persona.getFechaNacimiento() != null) {
                        about.append("                            <li><span class=\"title\">Fecha de nacimiento<b>:</b></span>"
                                        + persona.getFechaNacimiento() + "</li>\n");
                }

                if (persona.getTelefono() != null) {
                        about.append("                            <li><span class=\"title\">Teléfono<b>:</b></span>"
                                        + persona.getTelefono() + "</li>\n");
                }
                if (persona.getEmail() != null) {
                        about.append("                            <li><span class=\"title\">Email<b>:</b></span>"
                                        + persona.getEmail() + "</li>\n");
                }
                if (persona.getUbicacion() != null) {
                        about.append("                            <li><span class=\"title\">Ubicación<b>:</b></span><span>"
                                        + persona.getUbicacion() + "</span></li>\n");
                }

                about.append("                        </ul>\n")
                                .append("                    </div>\n")
                                .append("                </div>\n")
                                .append("            </div>\n")
                                .append("        </div>\n")
                                .append("    </div>\n")
                                .append("</section>\n")
                                .append("<!-- About section End -->\n");

                return about.toString();
        }

        private String generateSkillsSection(List<HardSkill> hardSkills, SoftSkill softSkills) {
                StringBuilder skills = new StringBuilder();
                skills.append("<!-- Skills section -->\n")
                                .append("<section id=\"skills\" class=\"ms-about padding-tb-80\">\n")
                                .append("    <div class=\"container\">\n")
                                .append("        <div class=\"row\">\n")
                                .append("            <div class=\"section-title\">\n")
                                .append("                <h2>Mis<span> Habilidades</span></h2>\n")
                                .append("                <span class=\"ligh-title\">Habilidades</span>\n")
                                .append("            </div>\n");

                // Hard Skills
                skills.append("            <div class=\"col-lg-6\">\n")
                                .append("                <h4 class=\"mb-4\">Hard Skills</h4>\n")
                                .append("                <div class=\"ms-skill-progress\">\n")
                                .append("                    <div class=\"row m-b-minus-30px\">\n");

                if (hardSkills != null && !hardSkills.isEmpty()) {
                        for (HardSkill hardSkill : hardSkills) {
                                if (hardSkill.getLenguaje() != null) {
                                        int percentage = convertNivelToPercentage(hardSkill.getNivelHabilidad());
                                        String nombre = hardSkill.getLenguaje().getValor() != null
                                                        ? hardSkill.getLenguaje().getValor()
                                                        : "Skill";
                                        String descripcion = hardSkill.getDescripcion() != null
                                                        ? hardSkill.getDescripcion()
                                                        : "";

                                        skills.append("                        <div class=\"col-md-6\">\n")
                                                        .append("                            <div class=\"ms-box\">\n")
                                                        .append("                                <svg class=\"progress noselect\" data-progress=\""
                                                                        + percentage
                                                                        + "\" x=\"0px\" y=\"0px\" viewBox=\"0 0 80 80\">\n")
                                                        .append("                                    <path class=\"track\" d=\"M5,40a35,35 0 1,0 70,0a35,35 0 1,0 -70,0\" />\n")
                                                        .append("                                    <path class=\"fill\" d=\"M5,40a35,35 0 1,0 70,0a35,35 0 1,0 -70,0\" />\n")
                                                        .append("                                    <text class=\"value\" x=\"50%\" y=\"58%\">0%</text>\n")
                                                        .append("                                </svg>\n")
                                                        .append("                                <h3>" + nombre
                                                                        + "</h3>\n")
                                                        .append("                                <p>" + descripcion
                                                                        + "</p>\n")
                                                        .append("                            </div>\n")
                                                        .append("                        </div>\n");
                                }
                        }
                }

                skills.append("                    </div>\n")
                                .append("                </div>\n")
                                .append("            </div>\n");

                // Soft Skills
                skills.append("            <div class=\"col-lg-6\">\n")
                                .append("                <h4 class=\"mb-4\">Soft Skills</h4>\n")
                                .append("                <div class=\"row service-box m-tb-minus-15px\">\n");

                if (softSkills != null && softSkills.getHabilidades() != null) {
                        int serviceCount = 0;
                        String[] serviceIcons = { "1.svg", "2.svg", "3.svg", "4.svg" };

                        for (String habilidad : softSkills.getHabilidades()) {
                                skills.append("            <div class=\"col-lg-6 col-md-6 col-xs-12\">\n")
                                                .append("                <div class=\"flipper\">\n")
                                                .append("                    <div class=\"main-box\">\n")
                                                .append("                        <div class=\"box-front height-300 white-bg\">\n")
                                                .append("                            <div class=\"content-wrap\">\n")
                                                .append("                                <div class=\"icon\">\n")
                                                .append("                                    <img class=\"icofont icofont-headphone-alt font-40px dark-color svg_img\"\n")
                                                .append("                                         src=\"assets/img/service/"
                                                                + serviceIcons[serviceCount % 4] + "\" alt=\""
                                                                + habilidad
                                                                + "\">\n")
                                                .append("                                </div>\n")
                                                .append("                                <h3>" + habilidad + "</h3>\n")
                                                .append("                            </div>\n")
                                                .append("                        </div>\n")
                                                .append("                        <div class=\"box-back height-300 gradient-bg\">\n")
                                                .append("                            <div class=\"content-wrap\">\n")
                                                .append("                                <h3>" + habilidad + "</h3>\n")
                                                .append("                            </div>\n")
                                                .append("                        </div>\n")
                                                .append("                    </div>\n")
                                                .append("                </div>\n")
                                                .append("            </div>\n");
                                serviceCount++;
                        }
                }

                skills.append("                </div>\n")
                                .append("            </div>\n")
                                .append("        </div>\n")
                                .append("    </div>\n")
                                .append("</section>\n")
                                .append("<!-- Skills section End -->\n");

                return skills.toString();
        }

        private String generateLanguagesSection(List<Idioma> idiomas) {
                if (idiomas == null || idiomas.isEmpty()) {
                        return "";
                }
                StringBuilder lang = new StringBuilder();
                lang.append("<!-- Languages section -->\n")
                                .append("<section id=\"languages\" class=\"ms-about padding-tb-80 sec-bg\">\n")
                                .append("    <div class=\"container\">\n")
                                .append("        <div class=\"row\">\n")
                                .append("            <div class=\"section-title\">\n")
                                .append("                <h2>Mis<span> Idiomas</span></h2>\n")
                                .append("                <span class=\"ligh-title\">Idiomas</span>\n")
                                .append("            </div>\n")
                                .append("            <div class=\"col-lg-12\">\n")
                                .append("                <div class=\"ms-languages-section\">\n")
                                .append("                    <div class=\"row service-box m-tb-minus-15px\">\n");

                for (Idioma idioma : idiomas) {
                        String backgroundStyle = "";
                        String additionalClass = "";

                        if (idioma.getBandera() != null && !idioma.getBandera().isEmpty()) {
                                backgroundStyle = "style=\"background-image: url('" + idioma.getBandera()
                                                + "'); background-size: cover; background-position: center;\"";
                                additionalClass = " language-with-flag";
                        }

                        lang.append("                        <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n")
                                        .append("                            <div class=\"flipper\">\n")
                                        .append("                                <div class=\"main-box\">\n")
                                        .append("                                    <div class=\"box-front height-300 white-bg language-front"
                                                        + additionalClass + "\" " + backgroundStyle + ">\n")
                                        .append("                                        <div class=\"content-wrap\">\n")
                                        .append("                                            <h3>"
                                                        + idioma.getDialecto() + "</h3>\n")
                                        .append("                                            <p>"
                                                        + idioma.getNivel_idioma() + "</p>\n")
                                        .append("                                        </div>\n")
                                        .append("                                    </div>\n")
                                        .append("                                    <div class=\"box-back height-300 gradient-bg\">\n")
                                        .append("                                        <div class=\"content-wrap\">\n")
                                        .append("                                            <h3>"
                                                        + idioma.getNivel_idioma()
                                                        + "</h3>\n")
                                        .append("                                            <p>"
                                                        + idioma.getDialecto() + "</p>\n")
                                        .append("                                        </div>\n")
                                        .append("                                    </div>\n")
                                        .append("                                </div>\n")
                                        .append("                            </div>\n")
                                        .append("                        </div>\n");
                }

                lang.append("                    </div>\n")
                                .append("                </div>\n")
                                .append("            </div>\n")
                                .append("        </div>\n")
                                .append("    </div>\n")
                                .append("</section>\n")
                                .append("<!-- Languages section End -->\n");

                return lang.toString();
        }

        private int convertNivelToPercentage(String nivel) {
                if (nivel == null)
                        return 50;
                switch (nivel.toLowerCase()) {
                        case "bajo":
                        case "básico":
                        case "beginner":
                                return 30;
                        case "medio":
                        case "intermediate":
                                return 60;
                        case "avanzado":
                        case "advanced":
                        case "experto":
                        case "expert":
                                return 85;
                        default:
                                return 50;
                }
        }

        private String generateEducationSection(Map<String, List<? extends Formacion>> formacion) {
                StringBuilder edu = new StringBuilder();
                edu.append("<!-- Start Education section -->\n")
                                .append("<section id=\"education\" class=\"ms-experience padding-tb-80\">\n")
                                .append("    <div class=\"container\">\n")
                                .append("        <div class=\"row\">\n")
                                .append("            <div class=\"section-title\">\n")
                                .append("                <h2>Mi <span>Formación</span></h2>\n")
                                .append("                <span class=\"ligh-title\">Formación</span>\n")
                                .append("            </div>\n")
                                .append("            <div class=\"col-lg-12\">\n");

                // Formación Oficial
                if (formacion != null && formacion.containsKey("Oficial")) {
                        List<? extends Formacion> oficiales = formacion.get("Oficial");
                        if (oficiales != null && !oficiales.isEmpty()) {
                                edu.append("                <div class=\"education ms-ex-box m-b-991\">\n")
                                                .append("                    <h4>Formación Oficial</h4>\n")
                                                .append("                    <ul class=\"timeline\">\n");

                                for (Formacion f : oficiales) {
                                        if (f instanceof FormacionOficial) {
                                                FormacionOficial oficial = (FormacionOficial) f;
                                                edu.append("                        <li class=\"timeline-item\">\n")
                                                                .append("                            <div class=\"timeline-info\">\n")
                                                                .append("                                <span>"
                                                                                + oficial.getAnoFinal() + "</span>\n")
                                                                .append("                            </div>\n")
                                                                .append("                            <div class=\"timeline-content\">\n")
                                                                .append("                                <h5 class=\"timeline-title\">"
                                                                                + oficial.getTitulo() +
                                                                                "<span class=\"sub\">- "
                                                                                + oficial.getCentro()
                                                                                + "</span></h5>\n");

                                                if (oficial.getFacultad() != null) {
                                                        edu.append("                                <p>"
                                                                        + oficial.getFacultad() + "</p>\n");
                                                }

                                                if (oficial.getPlanEstudios() != null
                                                                && !oficial.getPlanEstudios().isEmpty()) {
                                                        edu.append("                                <p><a href=\""
                                                                        + oficial.getPlanEstudios()
                                                                        + "\" target=\"_blank\">Ver plan de estudios</a></p>\n");
                                                }

                                                edu.append("                            </div>\n")
                                                                .append("                        </li>\n");
                                        }
                                }

                                edu.append("                    </ul>\n")
                                                .append("                </div>\n");
                        }
                }

                // Formación Complementaria
                if (formacion != null && formacion.containsKey("Complementaria")) {
                        List<? extends Formacion> complementarias = formacion.get("Complementaria");
                        if (complementarias != null && !complementarias.isEmpty()) {
                                edu.append("                <div class=\"education ms-ex-box m-b-991\" style=\"margin-top: 50px;\">\n")
                                                .append("                    <h4>Formación Complementaria</h4>\n")
                                                .append("                    <ul class=\"timeline\">\n");

                                for (Formacion f : complementarias) {
                                        if (f instanceof FormacionComplementaria) {
                                                FormacionComplementaria complementaria = (FormacionComplementaria) f;
                                                String año = complementaria.getAnoFinal() != null
                                                                ? String.valueOf(complementaria.getAnoFinal())
                                                                : "";

                                                edu.append("                        <li class=\"timeline-item\">\n")
                                                                .append("                            <div class=\"timeline-info\">\n")
                                                                .append("                                <span>" + año
                                                                                + "</span>\n")
                                                                .append("                            </div>\n")
                                                                .append("                            <div class=\"timeline-content\">\n")
                                                                .append("                                <h5 class=\"timeline-title\">"
                                                                                + complementaria.getTitulo() +
                                                                                "<span class=\"sub\">- "
                                                                                + complementaria.getCentro()
                                                                                + "</span></h5>\n");

                                                if (complementaria.getHoras() != null) {
                                                        edu.append("                                <p>Duración: "
                                                                        + complementaria.getHoras()
                                                                        + " horas</p>\n");
                                                }

                                                edu.append("                            </div>\n")
                                                                .append("                        </li>\n");
                                        }
                                }

                                edu.append("                    </ul>\n")
                                                .append("                </div>\n");
                        }
                }

                edu.append("            </div>\n")
                                .append("        </div>\n")
                                .append("    </div>\n")
                                .append("</section>\n")
                                .append("<!-- End Education Section -->\n");

                return edu.toString();
        }

        private String generateExperienceSection(List<ExperienciaItem> experiencia) {
                StringBuilder exp = new StringBuilder();
                exp.append("<!-- Start Experience section -->\n")
                                .append("<section id=\"experience\" class=\"ms-experience padding-tb-80 sec-bg\">\n")
                                .append("    <div class=\"container\">\n")
                                .append("        <div class=\"row\">\n")
                                .append("            <div class=\"section-title\">\n")
                                .append("                <h2>Mi <span>Experiencia</span></h2>\n")
                                .append("                <span class=\"ligh-title\">Experiencia</span>\n")
                                .append("            </div>\n")
                                .append("            <div class=\"col-lg-12\">\n");

                // Experiencia laboral
                if (experiencia != null && !experiencia.isEmpty()) {
                        exp.append("                <div class=\"experiense ms-ex-box\">\n")
                                        .append("                    <h4>Experiencia Profesional</h4>\n")
                                        .append("                    <ul class=\"timeline\">\n");

                        for (ExperienciaItem trabajo : experiencia) {
                                String periodo = "";
                                if (trabajo.getPeriodo() != null) {
                                        periodo = (trabajo.getPeriodo().getInicio() != null
                                                        ? trabajo.getPeriodo().getInicio()
                                                        : "") +
                                                        " - " +
                                                        (trabajo.getPeriodo().getFin() != null
                                                                        ? trabajo.getPeriodo().getFin()
                                                                        : "Present");
                                }

                                exp.append("                        <li class=\"timeline-item\">\n")
                                                .append("                            <div class=\"timeline-info\">\n")
                                                .append("                                <span>" + periodo
                                                                + "</span>\n")
                                                .append("                            </div>\n")
                                                .append("                            <div class=\"timeline-content\">\n")
                                                .append("                                <h5 class=\"timeline-title\">"
                                                                + trabajo.getPuesto() +
                                                                "<span class=\"sub\">- " + trabajo.getEmpresa()
                                                                + "</span></h5>\n");

                                if (trabajo.getDescripcion() != null) {
                                        exp.append("                                <p>" + trabajo.getDescripcion()
                                                        + "</p>\n");
                                }

                                // Añadir tecnologías
                                if (trabajo.getTecnologias() != null && !trabajo.getTecnologias().isEmpty()) {
                                        exp.append("                                <p><strong>Tecnologías:</strong> ");
                                        for (int i = 0; i < trabajo.getTecnologias().size(); i++) {
                                                Tecnologia tech = trabajo.getTecnologias().get(i);
                                                exp.append(tech.getValor());
                                                if (i < trabajo.getTecnologias().size() - 1) {
                                                        exp.append(", ");
                                                }
                                        }
                                        exp.append("</p>\n");
                                }

                                exp.append("                            </div>\n")
                                                .append("                        </li>\n");
                        }

                        exp.append("                    </ul>\n")
                                        .append("                </div>\n");
                }

                exp.append("            </div>\n")
                                .append("        </div>\n")
                                .append("    </div>\n")
                                .append("</section>\n")
                                .append("<!-- End Experience Section -->\n");

                return exp.toString();
        }

        private String generatePortfolioSection(List<Proyecto> portfolio) {
                if (portfolio == null || portfolio.isEmpty()) {
                        return "";
                }

                StringBuilder portfolioSection = new StringBuilder();
                portfolioSection.append("<!-- Start Portfolio Section -->\n")
                                .append("<section id=\"portfolio\" class=\"ms-portfolio padding-tb-80\">\n")
                                .append("    <div class=\"container\">\n")
                                .append("        <div class=\"section-title\">\n")
                                .append("            <h2><span>Proyectos</span></h2>\n")
                                .append("            <span class=\"ligh-title\">Portfolio</span>\n")
                                .append("        </div>\n")
                                .append("        <div class=\"row m-b-minus-24px\">\n")
                                .append("            <div class=\"portfolio-content\">\n")
                                .append("                <div>\n")
                                .append("                    <div class=\"row\">\n")
                                .append("                        <div class=\"col-sm-12\">\n")
                                .append("                        </div>\n")
                                .append("                        <div class=\"col-md-12 col-sm-12\">\n")
                                .append("                            <div class=\"portfolio-content-items\">\n")
                                .append("                                <div class=\"row m-b-minus-30px\">\n");

                int projectCount = 0;
                String[] projectImages = { "11.jpg", "22.jpg", "33.jpg", "44.jpg", "55.jpg", "66.jpg" };

                for (Proyecto proyecto : portfolio) {
                        if (projectCount >= 6)
                                break;

                        String category = "development";
                        if (proyecto.getRol() != null && proyecto.getRol().toLowerCase().contains("diseño")) {
                                category = "design";
                        }

                        String imagePath = "assets/img/portfolio/" + projectImages[projectCount % projectImages.length];

                        portfolioSection
                                        .append("                                    <div class=\"col-lg-6 mix "
                                                        + category + "\">\n")
                                        .append("                                        <div class=\"ms-project-box\">\n")
                                        .append("                                            <h3>"
                                                        + proyecto.getNombre() + "</h3>\n")
                                        .append("                                            <div class=\"links\">\n")
                                        .append("                                                <a href=\"#\">"
                                                        + proyecto.getRol()
                                                        + "</a>\n")
                                        .append("                                            </div>\n")
                                        .append("                                            <p>"
                                                        + proyecto.getDescripcion() + "\n")
                                        .append("                                                <a href=\"#\">Read more</a>\n")
                                        .append("                                            </p>\n")
                                        .append("                                            <div class=\"ms-info\">\n")
                                        .append("                                                <div class=\"portfolio-img\">\n")
                                        .append("                                                    <a class=\"\" data-fancybox=\"gallery\"\n")
                                        .append("                                                       href=\""
                                                        + imagePath + "\"\n")
                                        .append("                                                       style=\"background-image: url("
                                                        + imagePath + ")\">\n")
                                        .append("                                                        <span class=\"overlay\">+</span>\n")
                                        .append("                                                    </a>\n")
                                        .append("                                                </div>\n")
                                        .append("                                                <div class=\"ms-detail\">\n")
                                        .append("                                                    <ul>\n")
                                        .append("                                                        <li>Tiempo de desarrollo : "
                                                        + proyecto.getTdesarrollo() + "</li>\n")
                                        .append("                                                        <li>Rol : "
                                                        + proyecto.getRol()
                                                        + "</li>\n")
                                        .append("                                                        <li>Estado : "
                                                        + proyecto.getEstado() + "</li>\n");

                        if (proyecto.getEnlaces() != null && !proyecto.getEnlaces().isEmpty()) {
                                portfolioSection.append(
                                                "                                                        <li>URL : <a href=\""
                                                                + proyecto.getEnlaces().get(0)
                                                                + "\">Project Link</a></li>\n");
                        }

                        // Añadir tecnologías
                        if (proyecto.getTecnologias() != null && !proyecto.getTecnologias().isEmpty()) {
                                portfolioSection.append(
                                                "                                                        <li>Tecnologías: ");
                                for (int i = 0; i < proyecto.getTecnologias().size(); i++) {
                                        Tecnologia tech = proyecto.getTecnologias().get(i);
                                        portfolioSection.append(tech.getValor());
                                        if (i < proyecto.getTecnologias().size() - 1) {
                                                portfolioSection.append(", ");
                                        }
                                }
                                portfolioSection.append("</li>\n");
                        }

                        portfolioSection.append("                                                    </ul>\n")
                                        .append("                                                </div>\n")
                                        .append("                                            </div>\n")
                                        .append("                                        </div>\n")
                                        .append("                                    </div>\n");

                        projectCount++;
                }

                portfolioSection.append("                                </div>\n")
                                .append("                            </div>\n")
                                .append("                        </div>\n")
                                .append("                    </div>\n")
                                .append("                </div>\n")
                                .append("            </div>\n")
                                .append("        </div>\n")
                                .append("    </div>\n")
                                .append("</section>\n")
                                .append("<!-- End Portfolio Section -->\n");

                return portfolioSection.toString();
        }

        private String generateCounterSection(List<ExperienciaItem> experiencia, List<Proyecto> portfolio) {
                return "";
        }

        private String generateNewsSection() {
                return "";
        }

        private String generateContactSection(Persona persona) {
                return "";
        }

        private String generateFooter() {
                return "<!-- Start Footer -->\n" +
                                "<footer class=\"margin-t-80\">\n" +
                                "    <div class=\"container\">\n" +
                                "        <div class=\"ms-footer-detail\">\n" +
                                "            <div class=\"ms-copy\">\n" +
                                "                Copyright © 2024 Personal Portfolio. All rights reserved.\n" +
                                "            </div>\n" +
                                "        </div>\n" +
                                "    </div>\n" +
                                "</footer>\n" +
                                "<!-- End Footer -->\n";
        }

        private String generateScripts() {
                return "<!-- Vendor JS -->\n" +
                                "<script src=\"assets/js/vendor/jquery-3.1.1.min.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/bootstrap.bundle.min.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/tilt.jquery.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/mixitup.min.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/jquery.fancybox.min.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/slick.min.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/fontawesome.js\"></script>\n" +
                                "<script src=\"assets/js/vendor/tweenmax.min.js\"></script>\n" +
                                "<script src=\"assets/js/script.js\"></script>\n";
        }
}