let navMain;

window.onload = function () {
    navMain = document.getElementById('navMain');
    navMain.innerHTML = "<div class=\"vertical-nav nav-background\" id=\"sidebar\">" +
        "    <div class=\"py-4 px-3 mb-4 nav-background\">" +
        "        <div class=\"media d-flex align-items-center\">" +
        "            <div class=\"media-body\">\n" +
        "                <h4 class=\"m-0\">MN School Data</h4>\n" +
        "            </div>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <p class=\"headerNav px-3 small pb-4 mb-0\">Main</p>" +
        "    <ul class=\"nav flex-column nav-background mb-0\">" +
        "        <li class=\"nav-item\">" +
        "            <a href=\"#\" class=\"nav-link text-dark font-italic nav-background\">" +
        "                <i class=\"fa fa-th-large mr-3 text-primary fa-fw\"></i>Account" +
        "            </a>" +
        "        </li>" +
        "        <li class=\"nav-item\">\n" +
        "            <a href=\"#\" class=\"nav-link text-dark font-italic\">\n" +
        "                <i class=\"fa fa-address-card mr-3 text-primary fa-fw\"></i>\n" +
        "                District Info" +
        "            </a>\n" +
        "        </li>\n" +
        "        <li class=\"nav-item\">\n" +
        "            <a href=\"#\" class=\"nav-link text-dark font-italic\">\n" +
        "                <i class=\"fa fa-cubes mr-3 text-primary fa-fw\"></i>\n" +
        "                Comparison Info" +
        "            </a>\n" +
        "        </li>\n" +
        "    </ul>" +
        "    <br>" +
        "    <p class=\"headerNav px-3 small pb-4 mb-0\">Reports</p>\n" +
        "    <ul class=\"nav flex-column nav-background mb-0\">\n" +
        "        <li class=\"nav-item\">\n" +
        "            <a href=\"#\" class=\"nav-link text-dark font-italic nav-background\">\n" +
        "                <i class=\"fa fa-th-large mr-3 text-primary fa-fw\"></i>\n" +
        "                Total Revenues\n" +
        "            </a>\n" +
        "        </li>\n" +
        "        <li class=\"nav-item\">\n" +
        "            <a href=\"#\" class=\"nav-link text-dark font-italic\">\n" +
        "                <i class=\"fa fa-address-card mr-3 text-primary fa-fw\"></i>\n" +
        "                Total Expenditures\n" +
        "            </a>\n" +
        "        </li>\n" +
        "        <li class=\"nav-item\">\n" +
        "            <a href=\"#\" class=\"nav-link text-dark font-italic\">\n" +
        "                <i class=\"fa fa-cubes mr-3 text-primary fa-fw\"></i>\n" +
        "                State Totals\n" +
        "            </a>\n" +
        "        </li>" +
        "<br>" +
        "    <p class=\"headerNav px-3 small pb-4 mb-0\"><a href=\"/logout\" class=\"nav-link text-dark font-italic nav-background\">Logout</a></p>\n" +
        "    </ul>\n" +
        "\n" +
        "\n" +
        "</div>" ;

}
