let navSimple;

window.onload = function () {
    navSimple = document.getElementById('navSimple');
    navSimple.innerHTML = "<!-- Vertical navbar -->" +
        "<div class=\"vertical-nav nav-background\" id=\"sidebar\">" +
        "    <div class=\"py-4 px-3 mb-4 nav-background\">" +
        "        <div class=\"media d-flex align-items-center\">" +
        "            <div class=\"media-body\">\n" +
        "                <h4 class=\"m-0\">MN School Data</h4>\n" +
        "            </div>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <p class=\"headerNav px-3 small pb-4 mb-0\"'><a href=\"/login\" class=\"nav-link text-dark font-italic nav-background\">Login</a></p>\n" +
        "</div>";

}
