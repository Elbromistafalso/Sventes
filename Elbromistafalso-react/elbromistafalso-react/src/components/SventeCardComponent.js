import React from 'react'
import Proptypes from 'prop-types';
import "bootstrap/dist/js/bootstrap.bundle.min";
import DeleteConfirmationComponent from './DeleteConfirmationComponent';

let SventeCardComponent = (props) => {

    let confirmation = () => {

        if(props.isRequestToDelete === true){

            return (<DeleteConfirmationComponent/>)
        }
    }


    return(
        <div className="card">
            <img src={props.paveiksliukas} alt = "" style={{width:"250px", height:"200px"}}/>
            <div className="card-body">
                <p>Pavadinimas: {props.pavadinimas}</p>
                <p>Aprasymas: {props.aprasymas}</p>
                <button className="button" onClick={props.onConfirmation}>Ištrinti</button>
                <confirmation/>
            </div>
        </div>
    )
}

SventeCardComponent.propTypes = {
     
    aprasymas: Proptypes.string.isRequired,
    paveiksliukas: Proptypes.string.isRequired,
    pavadinimas: Proptypes.string.isRequired,
    onConfirmation: Proptypes.func.isRequired,
    isRequestToDelete: Proptypes.bool.isRequired
 };

export default SventeCardComponent