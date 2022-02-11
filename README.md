# Blood-Bowl-2-Overlay
Create an overlay that shows a partial state of the game. Including players on the field/KO/Cas boxes. This is mainly to be used for streaming to have a nice reference for viewers as to the current state of the game.

Currently, this will launch two GUIs; one that can edit the information, and one that can display it. The eventual plan is to have the display happening on a local website rather than a GUI with the intent of the broadcasting software being able to aquire the image needed without an extra browser window opened.

File structure:
  src - everything required to run
    InputGridBagThings - list of the grid bag constraints used for different assets (just to keep track of)
    OutputGridBagThings - list of the grid bag constraints used for different assets (just to keep track of)
  
  src/control - eventually will contain the true main function to the finished product
  src/control/listeners - all the listeners for different elements of the input
    RacesListener implements ActionListener - Resets inputs for the rest of the team (as everything just changed)
    RosteredPlayerPositionListener implements ActionListener - Resets the rest of the rostered player input when changed
  
  src/helpers
    Helpers - a list of strings and such
  
  src/view - anything that involves a GUI element
    OverlayGui extends JFrame - output GUI
    OverlayInput extends JDialog - input GUI
  src/view/input
    RacesInput extends JComboBox - The dropdown menu for picking the races of the teams
    RosteredPlayerInput extends JPanel - The panel that contains all the input for the rostered players
      Currently contains only the input for the position
      Will contain inputs for skills/cas's/spp
  src/view/output
    RacesField extends JLabel - The label that contains the image of the race. Currently shows a string rather than an image
    RosteredPlayerField extends JPanel - The panel that contains all the info about rostered players (this'll actually not be used in the end
  
  
  src/nonCode - all the noncode things, images, string constants
  src/nonCode/pngs - all the pngs used
  src/nonCode/pngs/races - the pngs used to show what race the team is
  src/nonCode/pngs/'X' - the pngs used to show what position a player is on a team, 'X' = the race name (ex: "Human", "Orc", "Dwarf", etc.)
