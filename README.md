# Blood-Bowl-2-Overlay
Create an overlay that shows a partial state of the game. Including players on the field/KO/Cas boxes. This is mainly to be used for streaming to have a nice reference for viewers as to the current state of the game.

Currently, this will launch two GUIs; one that can edit the information, and one that can display it. The eventual plan is to have the display happening on a local website rather than a GUI with the intent of the broadcasting software being able to aquire the image needed without an extra browser window opened.

File structure:
  src - everything required to run
  src/control - eventually will contain the true main function to the finished product
  <<<>>>src/control/listeners - all the listeners for different elements of the input
    RacesListener implements ActionListener - Resets inputs for the rest of the team (as everything just changed) <<<>>>not there right now
  
  src/view - anything that involves a GUI element
    OverlayGui extends JFrame - output GUI
    OverlayInput extends JDialog - input GUI
  src/view/output
    <<<>>>RacesField extends JLabel - The label that contains the image of the race. Currently shows a string rather than (Basically exists, just needs to become a class rather than just a variable)
  src/view/input
    <<<>>>RacesInput extends JComboBox - The dropdown menu for picking the races of the teams. Gets the string of all the races from (Basically just exists, just needs to become a class rather than just a variable)
  
  src/nonCode - all the noncode things, images, string constants
  src/nonCode/pngs - all the pngs used
  src/nonCode/pngs/races - the pngs used to show what race the team is
  src/nonCode/pngs/'X' - the pngs used to show what position a player is on a team, 'X' = the race name (ex: "Human", "Orc", "Dwarf", etc.)
