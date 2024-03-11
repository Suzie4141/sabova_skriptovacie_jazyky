var acc = document.getElementsByClassName("akordeon");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight) {
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    }
  });
}


    // Kontrola, či sme na správnej podstránke
    if (window.location.href.includes("slovensko.html")) {
        // Zobraziť peknejsi alert iba na podstránke so súťažou
        var confirmation = confirm("Vitajte v súťaži o najkrajšiu fotku Slovenska! Chcete sa zúčastniť?");
        
        if (confirmation) {
            // Ak používateľ klikne na OK
            alert("Skvelé! Pošlite nám svoju najkrajšiu fotku na mail: cestazahorizont@gmail.com. Držíme vám palce!");
        }
    }
  function showMessage() {
           $('#modalTitle').text('Zásady ochrany osobných údajov');
            $('#modalContent').html(`
                <p>Naposledy aktualizované: 10.12.2023</p>
                <p>Vitajte na našej webovej stránke! Na našej stránke si zakladáme na ochrane vašich osobných údajov a zabezpečení vašej súkromnej sféry. Tieto Zásady ochrany osobných údajov vám poskytnú informácie o tom, aké údaje zhromažďujeme, ako s nimi nakladáme a aké sú vaše možnosti v súvislosti s týmito údajmi.</p>
                <ol>
                    <li><strong>Zhromažďované údaje:</strong>
                        <ul>
                            <li><em>Osobné údaje:</em> Môžeme zhromažďovať vaše meno, e-mailovú adresu a ďalšie kontaktné údaje, ktoré poskytnete pri registrácii alebo pri kontakte s nami.</li>
                            <li><em>Informácie o používaní:</em> Sledujeme, ako interagujete s našou webovou stránkou, napríklad stránky, ktoré navštívite a akcie, ktoré podniknete.</li>
                        </ul>
                    </li>
                    <li><strong>Použitie údajov:</strong>
                        <ul>
                            <li>Poskytovanie a zlepšovanie našich služieb.</li>
                            <li>Prispôsobenie vašej skúsenosti na našej webovej stránke.</li>
                            <li>Odpovedanie na vaše otázky a poskytovanie zákazníckej podpory.</li>
                            <li>Zasielanie aktualizácií, bulletinov a propagačných materiálov na základe vášho súhlasu.</li>
                        </ul>
                    </li>
                    <li><strong>Zdieľanie údajov:</strong> Vaše osobné údaje nezdieľame s tretími stranami bez vášho súhlasu, s výnimkou prípadov uvedených v týchto Zásadach ochrany osobných údajov alebo na základe právnych povinností.</li>
                    <li><strong>Zabezpečenie údajov:</strong> Prijímame primerané opatrenia na ochranu bezpečnosti vašich osobných údajov, ale žiadny systém nie je úplne bezpečný.</li>
                    <li><strong>Vaše možnosti:</strong>
                        <ul>
                            <li>Máte právo pristupovať k svojim osobným údajom, aktualizovať ich alebo ich vymazať. Môžete tiež odmietnuť prijímanie marketingových komunikácií.</li>
                        </ul>
                    </li>
                    <li><strong>Zmeny v Zásadach ochrany osobných údajov:</strong> Tieto Zásady môžeme občas aktualizovať a zmeny budeme zverejňovať na tejto stránke s uvedením dátumu poslednej aktualizácie.</li>
                </ol>
                <p>V prípade otázok alebo obáv týkajúcich sa našich Zásad ochrany osobných údajov nás prosím kontaktujte na cestazahorizont@gmail.com.</p>
            `);
            $('#myModal').modal('show');
        }

        function acceptCookies() {
            // Váš kód na ukladanie stavu cookies (napríklad nastavenie cookie alebo iná logika)
            document.getElementById('cookie-bar').style.display = 'none';
        }

 