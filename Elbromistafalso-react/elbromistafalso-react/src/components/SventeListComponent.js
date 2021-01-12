import React from 'react';
import Proptypes from 'prop-types';
import SventeCardComponent from './SventeCardComponent';

let SventeListComponent = (props) => {

    let sventesCards = props.sventes.map(svente => {

        return(
            <SventeCardComponent
            aprasymas = {svente.aprasymas}
            paveiksliukas = {svente.paveiksliukas}
            pavadinimas = {svente.pavadinimas}
            isRequestToDelete = {props.isRequestToDelete}
            />
        )


    });

return (<div className="row">{sventesCards}</div>)

}

SventeListComponent.propTypes = {

    sventes: Proptypes.array.isRequired,
    isRequestToDelete: Proptypes.bool.isRequired
}

export default SventeListComponent