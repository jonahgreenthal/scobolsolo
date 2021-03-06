# Question futzing
* Change straight double quotes to curly quotes, in both question text and answer lines. There will still be some straight double quotes because of umlauts.
* Check question text and answer lines for these strings that are usually incorrect:
** `--`
** `,�`
** `.�` (okay if the enquoted text is a complete sentence [or multiple sentences])
** `, �` (okay if a comma would go there if the enquoted text were replaced by unenquoted text)
* Use the "Render All" page to verify that everything renders with no explicit errors and no obvious problems.

# Before emailing staff with instructions
* Make sure they all have accounts
* Update web/instructions/index.jsp if necessary (at least update the year in the menu)

# Before the tournament
* Make sure cards that end 5�2 or better have final messages about the championship match. Maybe we want to do this for all cards (e.g., to advertise the awards ceremony).
* Check "Online Stats?" on the tournament-edit page.
* Back up the database.
* Run the database maintenance "queries".
* Restart the server early the morning of the tournament so that the cached menu updates for today.
* Shut down as many other services running on the same server as possible (e.g., Masonic and maybe the development instance of the Solo app).


# At the tournament
* Make sure there are printed copies of all questions in the control room
* Make sure a buzzer system is available and set up for the championship match in advance (and that it can be kept until the finals end)
* Make sure there's a printed copy of the championship-match questions for buzzpoint tracking
* Make sure notes are kept at the award ceremony on which category winners did not pick up their ribbon


# After the tournament
* Re-enable disabled sites on the same server
* Restart the server the day after the tournament so that the cached menu updates.
* Archive messages so they won't still show up next year.
* Deactivate contacts who just finished their senior year
* Deactivate other contacts who should, in your judgment, be deactivated (e.g., retiring coaches, former staff who haven't worked in a long time)
* Back up the database.
* Run the database maintenance "queries".
