// Get object of URL parameters
var allVars = $.getUrlVars();

// Getting URL var by its nam
var newsID = $.getUrlVar('nid');

// Retrieve news list when application starts

//if (!newsID.length)
//	return;

$.findByID(newsID, 'findByID');
